package com.github.zefelipe.grpc.shoppingcart.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ShoppingCartServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server Running");
        Server server = ServerBuilder.forPort(50051)
                .addService(new ShoppingCartServiceImpl())
                .build();

        server.start();

        // whenever our java application receives a shutdown request, we are going to shutdown the service
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Receive Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        // wait the program execution
        server.awaitTermination();
    }
}
