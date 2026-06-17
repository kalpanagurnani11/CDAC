package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao {

    private List<Student> slist = new ArrayList<>();

    @Override
    public void addStudent(Student s) {
        slist.add(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return slist;
    }

    @Override
    public Student searchById(int id) {
        for (Student s : slist) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> searchByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : slist) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public double calculateGPA(int id) {
        Student s = searchById(id);
        if (s != null) {
            double gpa = (1.0/3)*s.getM1() + (1.0/2)*s.getM2() + (1.0/4)*s.getM3();
            s.setGpa(gpa);
            return gpa;
        }
        return -1;
    }
}