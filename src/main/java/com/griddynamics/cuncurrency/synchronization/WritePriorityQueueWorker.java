package com.griddynamics.cuncurrency.synchronization;

import java.util.concurrent.BlockingQueue;

public class WritePriorityQueueWorker implements Runnable{

    private final BlockingQueue<Integer> queue;

    public WritePriorityQueueWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put(4);
            queue.put(3);
            queue.put(1);
            queue.put(2);
            queue.put(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
