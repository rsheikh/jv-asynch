package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Task 1
//        CompletableFuture<Void> cf =
//                CompletableFuture.runAsync(() -> {
//                    System.out.println("Starting Async Process");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException ie) {
//                        ie.printStackTrace();
//                    }
//                    System.out.println("Hello world!");
//                });

        //Task 3
//        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World!");


        CompletableFuture<Void> futureNum1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Hello");
        });

        CompletableFuture<Void> futureNum2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("World!");
        });

        futureNum2.join();






    }
}


