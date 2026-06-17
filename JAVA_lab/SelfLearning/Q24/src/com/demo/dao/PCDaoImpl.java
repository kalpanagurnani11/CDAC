package com.demo.dao;

import com.demo.model.Consumer;
import com.demo.model.Producer;
import com.demo.model.SharedResource;

public class PCDaoImpl implements PCDao {

    @Override
    public void executeProducerConsumer() {

        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}