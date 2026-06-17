package com.demo.service;

import java.time.LocalDate;

public interface DateService {
    LocalDate convert(String s);
    String format(LocalDate d);
    long diff(String d1, String d2);
}