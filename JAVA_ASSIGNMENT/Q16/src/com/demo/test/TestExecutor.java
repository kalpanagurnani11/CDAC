package com.demo.test;

import com.demo.task.SumTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<Integer>> futures = new ArrayList<>();

        int sum = 0;

        try {
           
            for (int i = 1; i <= 51; i += 3) {

                SumTask task = new SumTask(i, i + 1, i + 2);
                Future<Integer> future = executor.submit(task);

                futures.add(future);
            }

            // collect results
            for (Future<Integer> f : futures) {
                sum += f.get();
            }

            System.out.println("Total Sum = " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}