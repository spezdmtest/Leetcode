package com.griddynamics.cuncurrency.synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayDemo {
    public static void main(String[] args) {
        List<Integer> list  = new CopyOnWriteArrayList<>();
        list.addAll(Arrays.asList(100500, 200800, 100, 200, 300, 500));

        WriteToCOWArrayWorker writeToCOWAArrayWorker = new WriteToCOWArrayWorker(list);
        ReadToCOWArrayWorker readToCOWAArrayWorker = new ReadToCOWArrayWorker(list);

        Thread t1 = new Thread(writeToCOWAArrayWorker);
        Thread t2 = new Thread(writeToCOWAArrayWorker);
        Thread t3 = new Thread(readToCOWAArrayWorker);

        t1.start();
        t2.start();
        t3.start();
    }
}
