package com.demo.dao;

import java.util.*;
import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao {

    Map<Student, ArrayList<String>> map = new HashMap<>();

    public void addStudent(int id, String name, String bdate,
                           String degree, double marks) {

        map.put(new Student(id, name, bdate, degree, marks),
                new ArrayList<>());
    }

    public void addSkill(int sid, String skill) {

        for (Student s : map.keySet()) {
            if (s.sid == sid) {
                map.get(s).add(skill);
            }
        }
    }

    public boolean deleteStudent(int sid) {
        return map.keySet().removeIf(s -> s.sid == sid);
    }

    public boolean deleteSkill(int sid, String skill) {

        for (Student s : map.keySet()) {
            if (s.sid == sid) {
                return map.get(s).remove(skill);
            }
        }
        return false;
    }

    public List<String> displayBySkill(String skill) {

        List<String> res = new ArrayList<>();

        for (Student s : map.keySet()) {
            if (map.get(s).contains(skill)) {
                res.add(s.toString());
            }
        }
        return res;
    }

    public List<String> displayByDegree(String degree) {

        List<String> res = new ArrayList<>();

        for (Student s : map.keySet()) {
            if (s.degree.equalsIgnoreCase(degree)) {
                res.add(s.toString());
            }
        }
        return res;
    }
}