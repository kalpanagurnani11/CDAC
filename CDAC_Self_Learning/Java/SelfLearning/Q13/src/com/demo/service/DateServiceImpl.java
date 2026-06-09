package com.demo.service;

import com.demo.dao.DateDAO;
import com.demo.dao.DateDAOImpl;
import java.time.LocalDate;

public class DateServiceImpl implements DateService {

    DateDAO dao = new DateDAOImpl();

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