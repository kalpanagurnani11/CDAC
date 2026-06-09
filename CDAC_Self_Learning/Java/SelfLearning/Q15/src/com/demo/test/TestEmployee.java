package com.demo.test;

import java.util.Scanner;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl();

        int choice;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Sort by Salary");
            System.out.println("4. Sort by Name");
            System.out.println("5. Sort by ID");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addEmployee();
                    break;
                case 2:
                    service.displayEmployees();
                    break;
                case 3:
                    service.sortBySalary();
                    service.displayEmployees();
                    break;
                case 4:
                    service.sortByName();
                    service.displayEmployees();
                    break;
                case 5:
                    service.sortById();
                    service.displayEmployees();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}