package com.demo.test;

import com.demo.service.DateService;
import com.demo.service.DateServiceImpl;
import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {

        DateService s = new DateServiceImpl();

        LocalDate d = s.convert("01-01-2024");

        System.out.println(s.format(d));
        System.out.println(s.diff("01-01-2024", "10-01-2024"));
    }
}