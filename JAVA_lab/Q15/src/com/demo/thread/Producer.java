package com.demo.thread;

import com.demo.model.Product;
import com.demo.service.SharedBuffer;

import java.io.*;
import java.util.*;

public class Producer extends Thread {

    SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("productdata.dat"));

            List<Product> list = (List<Product>) ois.readObject();

            for (Product p : list) {
                buffer.produce(p);
                System.out.println("Produced: " + p.getName());
            }

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}