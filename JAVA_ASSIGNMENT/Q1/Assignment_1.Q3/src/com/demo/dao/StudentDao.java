package com.demo.dao;

import java.util.List;
import com.demo.model.Student;

public interface StudentDao {
    void addStudent(Student s);
    List<Student> getAllStudents();
    Student searchById(int id);
    List<Student> searchByName(String name);
    double calculateGPA(int id);
}