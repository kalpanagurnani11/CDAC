package com.demo.test;

import java.util.Scanner;
import com.demo.service.QueueService;
import com.demo.service.QueueServiceImpl;

public class TestQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueService service = new QueueServiceImpl();

        int choice;

        do {
            System.out.println("\n1. Insert Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Peek Employee");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.insertEmployee();
                    break;

                case 2:
                    service.deleteEmployee();
                    break;

                case 3:
                    service.peekEmployee();
                    break;

                case 4:
                    service.displayQueue();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;
            }

        } while (choice != 5);
    }
}