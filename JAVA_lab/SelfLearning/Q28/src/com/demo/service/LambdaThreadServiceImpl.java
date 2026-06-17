package com.demo.service;

import com.demo.dao.LambdaThreadDao;
import com.demo.dao.LambdaThreadDaoImpl;

public class LambdaThreadServiceImpl implements LambdaThreadService {

    LambdaThreadDao dao = new LambdaThreadDaoImpl();

    public void execute() {
        dao.runThreads();
    }
}