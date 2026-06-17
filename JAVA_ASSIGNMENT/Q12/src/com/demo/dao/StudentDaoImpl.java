package com.demo.dao;

import com.demo.model.Student;
import java.io.*;
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

    @Override
    public List<Student> loadFromFile() {

        List<Student> fileList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                Student s = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3]
                );

                fileList.add(s);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileList;
    }
}