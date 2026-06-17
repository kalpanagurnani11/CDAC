package com.demo.test;

import com.demo.service.DateService;
import com.demo.service.DateServiceImpl;

import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        DateService service = new DateServiceImpl();

        LocalDate d = service.convert("01-01-2024");

        System.out.println(service.format(d));
        System.out.println(service.diff("01-01-2024", "15-01-2024"));
    }
}