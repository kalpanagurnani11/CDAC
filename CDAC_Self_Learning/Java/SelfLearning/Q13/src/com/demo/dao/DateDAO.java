package com.demo.dao;

import java.time.LocalDate;

public interface DateDAO {
    LocalDate toDate(String s);
    String toString(LocalDate d);
    long days(String d1, String d2);
}