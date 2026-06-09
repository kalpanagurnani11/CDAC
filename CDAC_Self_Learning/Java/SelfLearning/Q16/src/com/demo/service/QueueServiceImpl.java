package com.demo.service;

import java.util.Scanner;
import com.demo.dao.QueueDao;
import com.demo.dao.QueueDaoImpl;
import com.demo.model.Employee;

public class QueueServiceImpl implements QueueService {

    private QueueDao dao;

    public QueueServiceImpl() {
        dao = new QueueDaoImpl();
    }

    @Override
    public void insertEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        dao.insert(new Employee(id, name));
    }

    @Override
    public void deleteEmployee() {
        if (dao.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Removed: " + dao.delete());
        }
    }

    @Override
    public void peekEmployee() {
        System.out.println("Front: " + dao.peek());
    }

    @Override
    public void displayQueue() {
        dao.display();
    }
}