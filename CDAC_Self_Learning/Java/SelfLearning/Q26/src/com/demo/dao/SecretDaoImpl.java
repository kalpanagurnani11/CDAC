package com.demo.dao;

import com.demo.model.SecretClass;
import java.lang.reflect.Method;

public class SecretDaoImpl implements SecretDao {
    public void invokePrivateMethod() {
        try {
            SecretClass obj = new SecretClass();
            Method method = SecretClass.class.getDeclaredMethod("showSecret");
            method.setAccessible(true);
            method.invoke(obj);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}