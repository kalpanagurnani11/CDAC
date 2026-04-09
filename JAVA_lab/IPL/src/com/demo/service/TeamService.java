package com.demo.service;

import java.util.List;

public interface TeamService {

    void addTeam(int id, String name, String coach);

    List<?> getAllTeams();

    boolean deleteTeam(int id);

    boolean deletePlayer(int pid);

    void addPlayer(int teamId, int pid, String name, String sp);

    void modifyCoach(int teamId, String coach);

    List<String> displayBatsman();

    List<String> displayBySpeciality(String sp);
}