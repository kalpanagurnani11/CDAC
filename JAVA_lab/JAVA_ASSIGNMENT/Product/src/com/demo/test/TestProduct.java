package com.demo.test;

import java.util.*;
import com.demo.model.Product;
import com.demo.service.*;

public class TestProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductServiceImpl();

        int ch;

        do {
            System.out.println("\n1 Add Product");
            System.out.println("2 Display All");
            System.out.println("3 Calculate Tax");
            System.out.println("4 Exit");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter id name type mfgDate price: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String type = sc.next();
                    String mfg = sc.next();
                    double price = sc.nextDouble();

                    String exp = "-";
                    String cat = "-";

                    if (type.equalsIgnoreCase("perishable")) {
                        System.out.print("Enter exp date: ");
                        exp = sc.next();
                    } else {
                        System.out.print("Enter category: ");
                        cat = sc.next();
                    }

                    Product p = new Product(id, name, type, mfg, exp, cat, price);
                    service.addProduct(p);
                    break;

                case 2:
                    for (Product pr : service.getAllProducts()) {
                        System.out.println(pr);
                    }
                    break;

                case 3:
                    for (Product pr : service.getAllProducts()) {
                        System.out.println(pr + " Tax=" + service.calculateTax(pr));
                    }
                    break;

                case 4:
                    System.out.println("Exit");
            }

        } while (ch != 4);

        sc.close();
    }
}