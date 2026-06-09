package com.demo.dao;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateDAOImpl implements DateDAO {

    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public LocalDate toDate(String s) {
        return LocalDate.parse(s, f);
    }

    public String toString(LocalDate d) {
        return d.format(f);
    }

    public long days(String d1, String d2) {
        return Math.abs(java.time.temporal.ChronoUnit.DAYS.between(toDate(d1), toDate(d2)));
    }
}