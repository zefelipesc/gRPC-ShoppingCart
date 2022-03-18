package com.github.zefelipe.grpc.shoppingcart.client;

import java.util.UUID;

import com.proto.cart.CreateProductRequest;
import com.proto.cart.CreateProductResponse;
import com.proto.cart.Product;
import com.proto.cart.ReadProductRequest;
import com.proto.cart.ReadProductResponse;
import com.proto.cart.ShoppingCartServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ShoppingCartClient {
    public static void main(String[] args) {
        System.out.println("Client Running");

        ShoppingCartClient main = new ShoppingCartClient();
        main.createProduct();
    }

    private void createProduct() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // this will force ssl to be activated during development
                .build();

        // creating stub
        System.out.println("Creating stub");
        ShoppingCartServiceGrpc.ShoppingCartServiceBlockingStub stubClient = ShoppingCartServiceGrpc.newBlockingStub(channel);

        // Create product
        Product product = Product.newBuilder()
                .setProductId(UUID.randomUUID().toString())
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
        System.out.println("Reading product");
        ReadProductRequest readRequest = ReadProductRequest.newBuilder()
                .setProductId(createResponse.getProduct().getProductId())
                .build();

        ReadProductResponse readResponse = stubClient.readProduct(readRequest);
        System.out.println(readResponse.toString());

        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
