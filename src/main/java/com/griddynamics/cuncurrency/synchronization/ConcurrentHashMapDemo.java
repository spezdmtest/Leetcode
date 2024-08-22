package com.griddynamics.cuncurrency.synchronization;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        WriteToCHMWorker writeToCHMWorker = new WriteToCHMWorker(concurrentHashMap);
        ReadFromCHMWorker readFromCHMWorker = new ReadFromCHMWorker(concurrentHashMap);

        Thread t1 = new Thread(writeToCHMWorker);
        Thread t2 = new Thread(writeToCHMWorker);
        Thread t3 = new Thread(readFromCHMWorker);

        t1.start();
        t2.start();
        t3.start();
    }
}
