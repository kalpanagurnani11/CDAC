package com.demo.dao;

import java.util.List;
import com.demo.model.Team;

public interface TeamDao {

    void addTeam(Team t);

    List<Team> getAllTeams();

    boolean deleteTeam(int id);

    boolean deletePlayer(int pid);

    void addPlayer(int teamId, int pid, String name, String sp);

    void modifyCoach(int teamId, String coach);

    List<String> displayBatsman();

    List<String> displayBySpeciality(String sp);
}