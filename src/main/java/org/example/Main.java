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
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() ->
//        {
//            Thread.sleep(5000);
//            return "World!";
//        });


        CompletableFuture<String> futureNum1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            return "Hello";
        });

        CompletableFuture<String> futureNum2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
           return "World!";
        });

        CompletableFuture<String> combinedFuture = futureNum1.thenCombine(futureNum2, (Hello, World) -> Hello + ", " + World);
        String result = combinedFuture.join();

        System.out.println(result);

    }
}


