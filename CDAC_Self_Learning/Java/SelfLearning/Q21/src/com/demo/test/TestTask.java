package com.demo.test;

import com.demo.service.TaskService;
import com.demo.service.TaskServiceImpl;

public class TestTask {

    public static void main(String[] args) {

        TaskService service = new TaskServiceImpl();

        System.out.println("=== SAME TASK ===");
        service.executeSameTask();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== DIFFERENT TASKS ===");
        service.executeDifferentTasks();
    }
}