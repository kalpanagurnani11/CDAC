package com.demo.dao;

import com.demo.model.SameTask;
import com.demo.model.TaskOne;
import com.demo.model.TaskTwo;

public class TaskDaoImpl implements TaskDao {

   
    @Override
    public void runSameTask() {

        SameTask task = new SameTask();

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }

    
    @Override
    public void runDifferentTasks() {

        Thread t1 = new Thread(new TaskOne());
        Thread t2 = new Thread(new TaskTwo());

        t1.start();
        t2.start();
    }
}