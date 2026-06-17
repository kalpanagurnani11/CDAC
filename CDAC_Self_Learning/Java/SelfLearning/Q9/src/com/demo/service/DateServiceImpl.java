package com.demo.service;

import com.demo.dao.DateDao;

import com.demo.dao.DateDaoImpl;
import com.demo.service.DateService;

import java.time.LocalDate;

public class DateServiceImpl implements DateService {

    DateDao dao = new DateDaoImpl();

    public LocalDate convert(String s) {
        return dao.toDate(s);
    }

    public String format(LocalDate d) {
        return dao.toString(d);
    }

    public long diff(String d1, String d2) {
        return dao.days(d1, d2);
    }
}