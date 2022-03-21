package com.github.zefelipe.grpc.shoppingcart.client;

import java.util.UUID;

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

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ShoppingCartClient {

    static ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext() // this will force ssl to be activated during development
            .build();

    // creating stub
    static ShoppingCartServiceGrpc.ShoppingCartServiceBlockingStub stubClient = ShoppingCartServiceGrpc.newBlockingStub(channel);

    public static void main(String[] args) {
        System.out.println("Client Running");
        ShoppingCartClient main = new ShoppingCartClient();
        main.crud();

        System.out.println("Shutting down channel");
        channel.shutdown();
    }

    private void crud() {
        Product product = Product.newBuilder()
                .setName("Product")
                .setStock(10)
                .setPrice(100.0)
                .build();

        CreateProductRequest createRequest = CreateProductRequest.newBuilder()
                .setProduct(product)
                .build();

        CreateProductResponse createResponse = stubClient.createProduct(createRequest);
        System.out.println("Receive create product response");
        System.out.println(createResponse.toString());

        // Read product
        String productId = createResponse.getProduct().getProductId();
        ReadProductRequest readRequest = ReadProductRequest.newBuilder()
                .setProductId(productId)
                .build();

        ReadProductResponse readResponse = stubClient.readProduct(readRequest);

        System.out.println("Product read");
        System.out.println(readResponse.toString());

        // Update product
        Product updatedProduct = Product.newBuilder()
                .setProductId(productId)
                .setName("Updated Product")
                .setStock(20)
                .setPrice(200.0)
                .build();

        UpdateProductRequest updateRequest = UpdateProductRequest.newBuilder()
                .setProduct(updatedProduct)
                .build();

        UpdateProductResponse updateResponse = stubClient.updateProduct(updateRequest);

        System.out.println("Updated product");
        System.out.println(updateResponse.toString());

        // Delete product
        DeleteProductRequest deleteRequest = DeleteProductRequest.newBuilder()
                .setProductId(productId)
                .build();

        DeleteProductResponse deleteResponse = stubClient.deleteProduct(deleteRequest);
        System.out.println("Deleted product");

        // Reading product after deletion // should throw NOT_FOUND
        ReadProductRequest readProductAfterDeletionRequest = ReadProductRequest.newBuilder()
                .setProductId(productId)
                .build();

        ReadProductResponse readProductAfterDeletionResponse = stubClient.readProduct(readProductAfterDeletionRequest);

    }

}
