package com.demo.test;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestStream {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();

     
        System.out.println("Employee Names:");
        System.out.println(service.getAllNames());

       
        System.out.println("\nTotal Salary:");
        System.out.println(service.getTotalSalary());

     
        System.out.println("\nTotal Employees:");
        System.out.println(service.countEmployees());

      
        System.out.println("\nSorted by Salary:");
        service.sortBySalary().forEach(System.out::println);

   
        System.out.println("\nSalary > 30000:");
        service.filterSalary().forEach(System.out::println);
    }
}