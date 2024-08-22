package com.griddynamics.cuncurrency.executors;

import java.util.Random;

public class GenerateRandomIntegerTask implements Runnable {

    private final Random random = new Random();

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            int randomInt = random.nextInt(1000) + 1;
            System.out.println("SingleThreePoolTask " + randomInt);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
