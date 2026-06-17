package com.demo.test;

import com.demo.exception.InvalidAgeException;
import com.demo.exception.InvalidSalaryException;

public class ExceptionTest {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age invalid");
    }

    static void checkSalary(int sal) {
        if (sal < 10000) throw new InvalidSalaryException("Salary invalid");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        checkSalary(5000);
    }
}