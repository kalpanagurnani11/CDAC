package com.demo.service;

import com.demo.model.Grade;

public class GradeServiceImpl implements GradeService {

    @Override
    public void showRange(String grade) {

        try {
            Grade g = Grade.valueOf(grade.toUpperCase());

            System.out.println("Min Marks: " + g.getMin());
            System.out.println("Max Marks: " + g.getMax());

        } catch (Exception e) {
            System.out.println("Invalid Grade Entered!");
        }
    }
}