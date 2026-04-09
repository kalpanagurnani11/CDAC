package com.demo.service;

import java.util.List;
import com.demo.dao.*;

public class StudentServiceImpl implements StudentService {

    StudentDao dao = new StudentDaoImpl();

    public void addStudent(int id, String name, String bdate,
                           String degree, double marks) {
        dao.addStudent(id, name, bdate, degree, marks);
    }

    public void addSkill(int sid, String skill) {
        dao.addSkill(sid, skill);
    }

    public boolean deleteStudent(int sid) {
        return dao.deleteStudent(sid);
    }

    public boolean deleteSkill(int sid, String skill) {
        return dao.deleteSkill(sid, skill);
    }

    public List<String> displayBySkill(String skill) {
        return dao.displayBySkill(skill);
    }

    public List<String> displayByDegree(String degree) {
        return dao.displayByDegree(degree);
    }
}