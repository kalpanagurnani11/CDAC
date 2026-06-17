package com.demo.test;



import java.util.Scanner;

import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class UserTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserService service =
                new UserServiceImpl();

        System.out.println("Enter Username");
        String uname = sc.nextLine();

        System.out.println("Enter Address");
        String addr = sc.nextLine();

        User user =
                service.searchUser(uname, addr);

        if(user != null) {

            System.out.println(
                    user.getUsername());

            System.out.println(
                    user.getAddress());

            System.out.println(
                    user.getMobile());

            System.out.println(
                    user.getEmail());

        } else {

            System.out.println(
                    "User Not Found");

            System.out.println(
                    "Enter Mobile");

            String mobile =
                    sc.nextLine();

            System.out.println(
                    "Enter Email");

            String email =
                    sc.nextLine();

            service.addUser(
                    new User(uname,
                            addr,
                            mobile,
                            email));
        }
    }
}