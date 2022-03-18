package com.github.zefelipe.grpc.shoppingcart.server;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.cart.AddProductResponse;
import com.proto.cart.AddProductsRequest;
import com.proto.cart.Product;
import com.proto.cart.ShoppingCartServiceGrpc;

import io.grpc.stub.StreamObserver;

public class ShoppingCartServiceImpl extends ShoppingCartServiceGrpc.ShoppingCartServiceImplBase {

    // Create a mongo client to use to connect with my database
    private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    // Get/Create a database if it doesn't exist
    private MongoDatabase database = mongoClient.getDatabase("shoppingCartDb");
    // Get/Create the table(are collections in mongoDB) called product, inside my database

    private MongoCollection<Document> collection = database.getCollection("product");

    @Override
    public void addProduct(AddProductsRequest request, StreamObserver<AddProductResponse> responseObserver) {
        System.out.println("Receive Add Product Request");

        Product prod = request.getProduct();
        Document doc = new Document("productId", prod.getProductId())
                .append("name", prod.getName())
                .append("stock", prod.getStock())
                .append("price", prod.getPrice());

        System.out.println("Inserting product...");
        // Insert (create) the document in mongoDB
        collection.insertOne(doc);

        // Retrieve the mongoDb generatedID
        String id = doc.getObjectId("_id").toString();
        System.out.println("Inserted product with id: " + id);

        Product product = Product.newBuilder()
                .setProductId(id)
                .setName(prod.getName())
                .setStock(prod.getStock())
                .setPrice(prod.getPrice())
                .build();

        AddProductResponse response = AddProductResponse.newBuilder()
                .addProducts(product)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
