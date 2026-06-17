package com.demo.dao;

import com.demo.model.Employee;

public interface QueueDao {
    void insert(Employee e);
    Employee delete();
    Employee peek();
    boolean isEmpty();
    void display();
}