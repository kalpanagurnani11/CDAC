package com.demo.test;

import java.time.LocalDate;
import java.util.Scanner;

import com.demo.model.Friend;
import com.demo.service.FriendService;
import com.demo.service.FriendServiceImpl;

public class TestFriend {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FriendService service = new FriendServiceImpl();

        int choice;

        do {
            System.out.println("\n1. Add Friend");
            System.out.println("2. Display All Friends");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Hobby");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Lastname: ");
                    String lname = sc.nextLine();

                    System.out.print("Enter number of hobbies: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    String[] hobbies = new String[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter hobby: ");
                        hobbies[i] = sc.nextLine();
                    }

                    System.out.print("Enter Mobile: ");
                    String mob = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter DOB (yyyy-mm-dd): ");
                    String date = sc.next();
                    LocalDate dob = LocalDate.parse(date);

                    sc.nextLine();
                    System.out.print("Enter Address: ");
                    String addr = sc.nextLine();

                    Friend f = new Friend(id, name, lname, hobbies, mob, email, dob, addr);
                    service.addFriend(f);
                    break;

                case 2:
                    Friend[] all = service.getAllFriends();
                    for (Friend fr : all) {
                        if (fr != null)
                            System.out.println(fr);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();

                    Friend fr = service.searchById(sid);
                    System.out.println(fr != null ? fr : "Not Found");
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String nm = sc.nextLine();

                    Friend[] byName = service.searchByName(nm);
                    for (Friend f1 : byName) {
                        if (f1 != null)
                            System.out.println(f1);
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Hobby: ");
                    String hb = sc.nextLine();

                    Friend[] byHobby = service.searchByHobby(hb);
                    for (Friend f2 : byHobby) {
                        if (f2 != null)
                            System.out.println(f2);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 6);

        sc.close();
    }
}