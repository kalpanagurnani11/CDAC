package com.demo.model;

public class Player {

    public int pid;
    String name;
    public String speciality;

    public Player(int pid, String name, String speciality) {
        this.pid = pid;
        this.name = name;
        this.speciality = speciality;
    }

    public String toString() {
        return pid + " " + name + " " + speciality;
    }
}