package com.demo.service;

import java.util.List;
import com.demo.dao.*;
import com.demo.model.Team;

public class TeamServiceImpl implements TeamService {

    TeamDao dao = new TeamDaoImpl();

    public void addTeam(int id, String name, String coach) {
        dao.addTeam(new Team(id, name, coach));
    }

    public List<?> getAllTeams() {
        return dao.getAllTeams();
    }

    public boolean deleteTeam(int id) {
        return dao.deleteTeam(id);
    }

    public boolean deletePlayer(int pid) {
        return dao.deletePlayer(pid);
    }

    public void addPlayer(int teamId, int pid, String name, String sp) {
        dao.addPlayer(teamId, pid, name, sp);
    }

    public void modifyCoach(int teamId, String coach) {
        dao.modifyCoach(teamId, coach);
    }

    public List<String> displayBatsman() {
        return dao.displayBatsman();
    }

    public List<String> displayBySpeciality(String sp) {
        return dao.displayBySpeciality(sp);
    }
}