package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = new StudentDaoImpl();

    @Override
    public void displayFromFile() {

        List<Student> list = dao.readFromFile();

        System.out.println("Students from File:");

        for (Student s : list) {
            System.out.println(
                s.getStudId() + " " +
                s.getName() + " " +
                s.getDegree() + " " +
                s.getEmail()
            );
        }
    }
}