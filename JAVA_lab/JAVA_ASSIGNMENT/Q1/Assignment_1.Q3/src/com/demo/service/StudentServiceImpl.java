package com.demo.service;

import java.util.List;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = new StudentDaoImpl();

    @Override
    public void addStudent(Student s) {
        dao.addStudent(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public Student searchById(int id) {
        return dao.searchById(id);
    }

    @Override
    public List<Student> searchByName(String name) {
        return dao.searchByName(name);
    }

    @Override
    public double calculateGPA(int id) {
        return dao.calculateGPA(id);
    }
}