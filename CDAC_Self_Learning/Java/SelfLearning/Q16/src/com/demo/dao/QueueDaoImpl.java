package com.demo.dao;

import java.util.LinkedList;
import java.util.Queue;
import com.demo.model.Employee;

public class QueueDaoImpl implements QueueDao {

    private Queue<Employee> queue;

    public QueueDaoImpl() {
        queue = new LinkedList<>();
    }

    @Override
    public void insert(Employee e) {
        queue.offer(e);   // enqueue
    }

    @Override
    public Employee delete() {
        return queue.poll();   // dequeue
    }

    @Override
    public Employee peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void display() {
        queue.forEach(System.out::println);
    }
}