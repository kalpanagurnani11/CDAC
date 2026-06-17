package com.demo.thread;

import com.demo.model.Product;
import com.demo.model.ProductAmount;
import com.demo.service.SharedBuffer;

import java.io.*;
import java.util.*;

public class Consumer extends Thread {

    SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        try {
            List<ProductAmount> outList = new ArrayList<>();

            for (int i = 0; i < 5; i++) { // assuming 5 products
                Product p = buffer.consume();

                double amount = p.getQty() * p.getPrice();
                amount += amount * 0.10;

                ProductAmount pa = new ProductAmount(
                        p.getId(),
                        p.getName(),
                        p.getQty(),
                        p.getPrice(),
                        amount
                );

                outList.add(pa);
                System.out.println("Consumed: " + p.getName());
            }

            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("productamount.dat"));

            oos.writeObject(outList);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}