package com.demo.dao;

import java.util.*;

public interface StudentDao {

    void addStudent(int id, String name, String bdate, String degree, double marks);

    void addSkill(int sid, String skill);

    boolean deleteStudent(int sid);

    boolean deleteSkill(int sid, String skill);

    List<String> displayBySkill(String skill);

    List<String> displayByDegree(String degree);
}