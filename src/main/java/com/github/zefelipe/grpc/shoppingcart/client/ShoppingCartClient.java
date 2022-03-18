package com.github.zefelipe.grpc.shoppingcart.client;

import java.util.UUID;

import com.proto.cart.AddProductResponse;
import com.proto.cart.AddProductsRequest;
import com.proto.cart.Product;
import com.proto.cart.ShoppingCartServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ShoppingCartClient {
    public static void main(String[] args) {
        System.out.println("Client Running");

        ShoppingCartClient main = new ShoppingCartClient();
        main.run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // this will force ssl to be activated during development
                .build();

        // creating stub
        System.out.println("Creating stub");
        ShoppingCartServiceGrpc.ShoppingCartServiceBlockingStub stubClient = ShoppingCartServiceGrpc.newBlockingStub(channel);

        Product product = Product.newBuilder()
                .setProductId(UUID.randomUUID().toString())
                .setName("Product 1")
                .setStock(10)
                .setPrice(100.0)
                .build();

        AddProductsRequest request = AddProductsRequest.newBuilder()
                .setProduct(product)
                .build();

        AddProductResponse addResponse = stubClient.addProduct(request);
        System.out.println("Receive add product response");
        System.out.println(addResponse.toString());

        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
