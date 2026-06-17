package com.demo.dao;

import com.demo.model.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> readFromFile() {

        List<Student> list = new ArrayList<>();

        try {
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("students.dat"));

            list = (List<Student>) ois.readObject();

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}