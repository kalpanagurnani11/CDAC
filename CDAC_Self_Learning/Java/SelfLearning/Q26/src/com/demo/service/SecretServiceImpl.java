package com.demo.service;

import com.demo.dao.SecretDao;
import com.demo.dao.SecretDaoImpl;

public class SecretServiceImpl implements SecretService {
    SecretDao dao = new SecretDaoImpl();

    public void execute() {
        dao.invokePrivateMethod();
    }
}