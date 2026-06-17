package com.demo.service
;

import com.demo.model.Product;

public class SharedBuffer {

    Product product;
    boolean flag = false;

    public synchronized void produce(Product p) throws Exception {
        if (flag) wait();

        this.product = p;
        flag = true;
        notify();
    }

    public synchronized Product consume() throws Exception {
        if (!flag) wait();

        flag = false;
        notify();
        return product;
    }
}