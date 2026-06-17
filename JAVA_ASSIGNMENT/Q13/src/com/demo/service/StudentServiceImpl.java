package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = new StudentDaoImpl();

    @Override
    public void addStudent(Student s) {
        dao.addStudent(s);
    }

    @Override
    public void saveToFile() {
        try {
            List<Student> list = dao.getAllStudents();

            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("students.dat"));

            oos.writeObject(list);

            oos.close();

            System.out.println("Objects written to file successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}