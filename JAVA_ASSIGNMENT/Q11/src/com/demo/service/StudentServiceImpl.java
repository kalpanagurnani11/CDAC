package com.demo.service;

import com.demo.dao.*;
import com.demo.model.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = new StudentDaoImpl();

    @Override
    public void addStudent(Student s) {
        dao.addStudent(s);
    }

    @Override
    public void exitAndSave() {
        try {
            List<Student> list = dao.getAllStudents();

            BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));

            for (Student s : list) {
                bw.write(
                    s.getStudId() + "," +
                    s.getName() + "," +
                    s.getDegree() + "," +
                    s.getEmail()
                );
                bw.newLine();
            }

            bw.close();
            System.out.println("Data saved to CSV file!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}