package com.griddynamics.testAlgorithms.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FactorialCalculator extends RecursiveTask<Integer> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    protected Integer compute() {
        if (number <= 1) {
            return 1;
        } else {
            FactorialCalculator subTask =
                    new FactorialCalculator(number - 1);
            subTask.fork();
            return number * subTask.join();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        FactorialCalculator task = new FactorialCalculator(10);
        int result = pool.invoke(task);
        System.out.println(result);
    }
}
