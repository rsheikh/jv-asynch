package org.example;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        System.out.println("------");
        CompletableFuture<Void> cf =
        CompletableFuture.runAsync(() -> {
            System.out.println("Starting Async Process");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Hello world!");
        });

        cf.join();
        }

}