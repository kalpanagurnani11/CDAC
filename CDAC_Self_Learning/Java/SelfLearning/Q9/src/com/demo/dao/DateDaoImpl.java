package com.demo.dao;

import com.demo.dao.DateDao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDaoImpl implements DateDao {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public LocalDate toDate(String s) {
        return LocalDate.parse(s, f);
    }

    public String toString(LocalDate d) {
        return d.format(f);
    }

    public long days(String d1, String d2) {
        return Math.abs(ChronoUnit.DAYS.between(toDate(d1), toDate(d2)));
    }
}