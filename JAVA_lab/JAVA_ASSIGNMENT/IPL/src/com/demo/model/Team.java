package com.demo.model;

import java.util.ArrayList;

public class Team {

    public int teamId;
    String tname;
    public String coach;
    public ArrayList<Player> plist;

    public Team(int teamId, String tname, String coach) {
        this.teamId = teamId;
        this.tname = tname;
        this.coach = coach;
        plist = new ArrayList<>();
    }

    public String toString() {
        return teamId + " " + tname + " Coach:" + coach;
    }
}