package com.demo.test;

import java.util.*;
import com.demo.service.*;

public class TestTeam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TeamService service = new TeamServiceImpl();

        int ch;

        do {
            System.out.println("\n1 Add Team");
            System.out.println("2 Delete Team");
            System.out.println("3 Delete Player");
            System.out.println("4 Display Batsman");
            System.out.println("5 Display by Speciality");
            System.out.println("6 Add Player");
            System.out.println("7 Modify Coach");
            System.out.println("8 Exit");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter id name coach: ");
                    service.addTeam(sc.nextInt(), sc.next(), sc.next());
                    break;

                case 2:
                    System.out.print("Enter team id: ");
                    System.out.println(service.deleteTeam(sc.nextInt()));
                    break;

                case 3:
                    System.out.print("Enter player id: ");
                    System.out.println(service.deletePlayer(sc.nextInt()));
                    break;

                case 4:
                    for (String s : service.displayBatsman())
                        System.out.println(s);
                    break;

                case 5:
                    System.out.print("Enter speciality: ");
                    for (String s : service.displayBySpeciality(sc.next()))
                        System.out.println(s);
                    break;

                case 6:
                    System.out.print("Enter teamId pid name speciality: ");
                    service.addPlayer(sc.nextInt(), sc.nextInt(), sc.next(), sc.next());
                    break;

                case 7:
                    System.out.print("Enter teamId new coach: ");
                    service.modifyCoach(sc.nextInt(), sc.next());
                    break;

                case 8:
                    System.out.println("Exit");
            }

        } while (ch != 8);

        sc.close();
    }
}