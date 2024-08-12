package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

        //Task 4
//        CompletableFuture<String> futureNum1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(8000);
//            } catch (InterruptedException ie) {
//                ie.printStackTrace();
//            }
//            return "Hello";
//        });
//
//        CompletableFuture<String> futureNum2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException ie) {
//                ie.printStackTrace();
//            }
//           return "World!";
//        });
//
//        CompletableFuture<String> combinedFuture = futureNum1.thenCombine(futureNum2, (Hello, World) -> Hello + ", " + World);
//        combinedFuture = combinedFuture.orTimeout(10000, TimeUnit.MILLISECONDS).exceptionally(ex -> {
//            if(ex instanceof TimeoutException) {
//                return "Combined Time exceeds 10 seconds";
//           }
//            return "An error has occurred";
//        });
//        System.out.println(combinedFuture.get());



        String data = "85671 34262 92143 50984 24515 68356 77247 12348 56789 98760";

        String[] numbersString = data.split(" ");

        List<BigInteger> integerList = new ArrayList<>();
        for (String number: numbersString) {
            integerList.add(new BigInteger(number));
        }

        System.out.println(integerList);



                for (BigInteger number : integerList) {
                    CompletableFuture<BigInteger> numberFuture = CompletableFuture.supplyAsync(() -> {number)
                }




    }

    private static BigInteger calculateFactorial(BigInteger num) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }
}


