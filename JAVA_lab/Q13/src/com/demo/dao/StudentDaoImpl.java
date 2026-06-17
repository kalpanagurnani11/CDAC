package com.demo.dao;

import com.demo.model.Student;
import java.util.*;

public class StudentDaoImpl implements StudentDao {

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student s) {
        list.add(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return list;
    }
}