package com.demo.dao;

import java.util.*;
import com.demo.model.*;

public class TeamDaoImpl implements TeamDao {

    List<Team> tlist = new ArrayList<>();

    public void addTeam(Team t) {
        tlist.add(t);
    }

    public List<Team> getAllTeams() {
        return tlist;
    }

    public boolean deleteTeam(int id) {
        return tlist.removeIf(t -> t.teamId == id);
    }

    public boolean deletePlayer(int pid) {
        for (Team t : tlist) {
            if (t.plist.removeIf(p -> p.pid == pid))
                return true;
        }
        return false;
    }

    public void addPlayer(int teamId, int pid, String name, String sp) {
        for (Team t : tlist) {
            if (t.teamId == teamId) {
                t.plist.add(new Player(pid, name, sp));
            }
        }
    }

    public void modifyCoach(int teamId, String coach) {
        for (Team t : tlist) {
            if (t.teamId == teamId) {
                t.coach = coach;
            }
        }
    }

    public List<String> displayBatsman() {
        List<String> res = new ArrayList<>();

        for (Team t : tlist) {
            for (Player p : t.plist) {
                if (p.speciality.equalsIgnoreCase("batsman"))
                    res.add(p.toString());
            }
        }
        return res;
    }

    public List<String> displayBySpeciality(String sp) {
        List<String> res = new ArrayList<>();

        for (Team t : tlist) {
            for (Player p : t.plist) {
                if (p.speciality.equalsIgnoreCase(sp))
                    res.add(p.toString());
            }
        }
        return res;
    }
}