package com.griddynamics.cuncurrency.virtualthreads;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumberTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().threadId() + " generate: " + ThreadLocalRandom.current().nextInt());
    }
}
