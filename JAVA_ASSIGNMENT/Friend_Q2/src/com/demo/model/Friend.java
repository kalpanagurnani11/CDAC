package com.demo.model;

import java.time.LocalDate;

public class Friend {
    private int id;
    private String name;
    private String lastname;
    private String[] hobbies;
    private String mobno;
    private String email;
    private LocalDate bdate;
    private String address;

    public Friend(int id, String name, String lastname, String[] hobbies,
                  String mobno, String email, LocalDate bdate, String address) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.hobbies = hobbies;
        this.mobno = mobno;
        this.email = email;
        this.bdate = bdate;
        this.address = address;
    }

    // GETTERS
    public int getId() { return id; }
    public String getName() { return name; }
    public String getLastname() { return lastname; }
    public String[] getHobbies() { return hobbies; }
    public String getMobno() { return mobno; }
    public String getEmail() { return email; }
    public LocalDate getBdate() { return bdate; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        String h = "";
        for (String s : hobbies) {
            h += s + " ";
        }
        return "ID=" + id + ", Name=" + name + " " + lastname +
               ", Hobbies=" + h +
               ", Mobile=" + mobno +
               ", Email=" + email +
               ", DOB=" + bdate +
               ", Address=" + address;
    }
}