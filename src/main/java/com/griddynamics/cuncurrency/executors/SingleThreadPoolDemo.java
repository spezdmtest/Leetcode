package com.griddynamics.cuncurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()){
            for (int i = 0; i < 100; i++) {
                executorService.submit(new GenerateRandomIntegerTask());
            }
        } finally {
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("Processing in: " + duration + " ms");
        }
    }
}
