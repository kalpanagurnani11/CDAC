package com.demo.test;

import com.demo.service.*;
import java.util.*;

public class TestCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService service = new CartServiceImpl();

        while (true) {
            System.out.println("\n1.Buy Products 2.Send Delivery 0.Exit");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter username: ");
                    String user = sc.next();

                    service.showProducts();

                    System.out.print("Choice: ");
                    int choice = sc.nextInt();

                    System.out.print("Qty: ");
                    int qty = sc.nextInt();

                    service.buyProduct(user, choice, qty);
                    break;

                case 2:
                    service.showUsers();

                    System.out.print("Enter username: ");
                    user = sc.next();

                    service.deliver(user);
                    break;

                case 0:
                    return;
            }
        }
    }
}