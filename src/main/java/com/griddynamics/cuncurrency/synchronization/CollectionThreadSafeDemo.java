package com.griddynamics.cuncurrency.synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionThreadSafeDemo {
    public static void main(String[] args) {
        List<Integer> threadThreadSafeList = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++)
                threadThreadSafeList.add(i);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++)
                threadThreadSafeList.add(i);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("threadUnsafeList: " + threadThreadSafeList.size());
    }
}
