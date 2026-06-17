package com.demo.service;

import com.demo.dao.TaskDao;
import com.demo.dao.TaskDaoImpl;

public class TaskServiceImpl implements TaskService {

    private TaskDao dao = new TaskDaoImpl();

    @Override
    public void executeSameTask() {
        dao.runSameTask();
    }

    @Override
    public void executeDifferentTasks() {
        dao.runDifferentTasks();
    }
}