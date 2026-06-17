package com.demo.service;

import java.util.List;
import com.demo.model.Student;

public interface StudentService {
    void addStudent(Student s);
    List<Student> getAllStudents();
    Student searchById(int id);
    List<Student> searchByName(String name);
    double calculateGPA(int id);
}