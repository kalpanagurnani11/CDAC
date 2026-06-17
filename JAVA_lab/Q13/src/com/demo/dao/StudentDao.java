package com.demo.dao;

import com.demo.model.Student;
import java.util.List;

public interface StudentDao {
    void addStudent(Student s);
    List<Student> getAllStudents();
}