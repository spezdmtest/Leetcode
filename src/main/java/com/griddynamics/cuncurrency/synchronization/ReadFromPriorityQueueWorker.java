package com.griddynamics.cuncurrency.synchronization;

import java.util.concurrent.BlockingQueue;

public class ReadFromPriorityQueueWorker implements Runnable {

    private BlockingQueue<Integer> queue;

    public ReadFromPriorityQueueWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Take: " + queue.take());
            System.out.println("Take: " + queue.take());
            System.out.println("Take: " + queue.take());
            System.out.println("Take: " + queue.take());
            System.out.println("Take: " + queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
