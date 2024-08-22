package com.griddynamics.cuncurrency.synchronization;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        WritePriorityQueueWorker writePriorityQueueWorker = new WritePriorityQueueWorker(queue);
        ReadFromPriorityQueueWorker readFromPriorityQueueWorker = new ReadFromPriorityQueueWorker(queue);

        Thread t1 = new Thread(writePriorityQueueWorker);
        Thread t2 = new Thread(readFromPriorityQueueWorker);

        t1.start();
        t2.start();
    }
}
