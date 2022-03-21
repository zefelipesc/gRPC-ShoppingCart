package com.github.zefelipe.grpc.shoppingcart.server;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.proto.cart.CreateProductRequest;
import com.proto.cart.CreateProductResponse;
import com.proto.cart.DeleteProductRequest;
import com.proto.cart.DeleteProductResponse;
import com.proto.cart.Product;
import com.proto.cart.ReadProductRequest;
import com.proto.cart.ReadProductResponse;
import com.proto.cart.ShoppingCartServiceGrpc;
import com.proto.cart.UpdateProductRequest;
import com.proto.cart.UpdateProductResponse;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class ShoppingCartServiceImpl extends ShoppingCartServiceGrpc.ShoppingCartServiceImplBase {

    // Create a mongo client to use to connect with my database
    final private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

    // Get/Create a database if it doesn't exist
    final private MongoDatabase database = mongoClient.getDatabase("shoppingCartDb");

    // Get/Create the table(are collections in mongoDB) called product, inside my database
    final private MongoCollection<Document> collection = database.getCollection("product");

    @Override
    public void createProduct(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver) {
        System.out.println("Receive Create Product Response");

        Product prod = request.getProduct();
        Document doc = new Document("name", prod.getName())
                .append("stock", prod.getStock())
                .append("price", prod.getPrice());

        System.out.println("Inserting product...");
        // Insert (create) the document in mongoDB
        collection.insertOne(doc);

        // Retrieve the mongoDb generatedID
        String id = doc.getObjectId("_id").toString();
        System.out.println("Inserted product with objectID: " + id);

        Product product = Product.newBuilder()
                .setProductId(id)
                .setName(prod.getName())
                .setStock(prod.getStock())
                .setPrice(prod.getPrice())
                .build();

        CreateProductResponse response = CreateProductResponse.newBuilder()
                .setProduct(product)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void readProduct(ReadProductRequest request, StreamObserver<ReadProductResponse> responseObserver) {
        System.out.println("Receive Read Product Response");
        String productId = request.getProductId();

        // I need to do a wrapper into a new ObjectId, because in mongoDB de _id field is already wrapped into a objectId(it is not a string)
        // I find in the collection all the matching elements that have the id equals to the productId from request
       System.out.println("Searching product...");
       Document result = collection.find(eq("_id", new ObjectId(productId))).first();

       if (result == null) {
           responseObserver.onError(Status.NOT_FOUND.withDescription("The product with the searched id wasn't found").asRuntimeException());
           System.out.println("Product not found!");
       } else {
           Product product = Product.newBuilder()
                   .setProductId(productId)
                   .setName(result.getString("name"))
                   .setStock(result.getInteger("stock"))
                   .setPrice(result.getDouble("price"))
                   .build();

           ReadProductResponse response = ReadProductResponse.newBuilder()
                   .setProduct(product)
                   .build();

           responseObserver.onNext(response);
           responseObserver.onCompleted();
           System.out.println("Product found!");
       }
    }

    @Override
    public void updateProduct(UpdateProductRequest request, StreamObserver<UpdateProductResponse> responseObserver) {
        System.out.println("Receive Update Product Response");
        String productId = request.getProduct().getProductId();

        // I need to do a wrapper into a new ObjectId, because in mongoDB de _id field is already wrapped into a objectId(it is not a string)
        // I find in the collection all the matching elements that have the id equals to the productId from request
        System.out.println("Searching product to update...");
        Document result = collection.find(eq("_id", new ObjectId(productId))).first();
        if (result == null) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("The product with the searched id wasn't found").asRuntimeException());
            System.out.println("Product not found!");
        } else {
            Document update = new Document("productId", request.getProduct().getProductId())
                    .append("name", request.getProduct().getName())
                    .append("stock", request.getProduct().getStock())
                    .append("price", request.getProduct().getPrice())
                    .append("_id", new ObjectId(productId));

            // I'm replacing in the collection for the corresponding id with the update product
            System.out.println("Updating product...");
            collection.replaceOne(eq("_id", result.getObjectId("_id")), update);

            Product updatedProduct = Product.newBuilder()
                    .setProductId(update.getString("productId"))
                    .setName(update.getString("name"))
                    .setStock(update.getInteger("stock"))
                    .setPrice(update.getDouble("price"))
                    .build();

            UpdateProductResponse response = UpdateProductResponse.newBuilder()
                    .setProduct(updatedProduct)
                    .build();

            System.out.println("Updated! Sending as response");
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            System.out.println("Product found!");
        }
    }

    @Override
    public void deleteProduct(DeleteProductRequest request, StreamObserver<DeleteProductResponse> responseObserver) {
        System.out.println("Receive Delete Product Response");
        String productId = request.getProductId();

        DeleteResult result = collection.deleteOne(eq("_id", new ObjectId(productId)));

        if (result.getDeletedCount() == 0) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("The product with the searched id wasn't found").asRuntimeException());
            System.out.println("Product not found!");
        } else {
            System.out.println("Product deleted!");
            DeleteProductResponse deleteResponse = DeleteProductResponse.newBuilder()
                    .setProductId(productId)
                    .build();

            responseObserver.onNext(deleteResponse);
            responseObserver.onCompleted();
        }
    }
}
