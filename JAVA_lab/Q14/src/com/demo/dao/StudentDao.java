package com.demo.dao;

import com.demo.model.Student;
import java.util.List;

public interface StudentDao {
    List<Student> readFromFile();
}