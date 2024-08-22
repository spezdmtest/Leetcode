package com.griddynamics.cuncurrency.synchronization;

import java.util.List;

public class ReadToCOWArrayWorker implements Runnable {

    private final List<Integer> list;

    public ReadToCOWArrayWorker(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(150);
                System.out.println(list);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
