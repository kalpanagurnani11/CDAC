package com.demo.test;

import com.demo.service.*;
import java.util.*;

public class TestCityTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CityTreeService service = new CityTreeServiceImpl();

        while (true) {
            System.out.println("\n1.Add 2.Find 3.Delete 4.Display 0.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();

                    System.out.print("Enter trees (comma separated): ");
                    List<String> trees = Arrays.asList(sc.nextLine().split(","));

                    service.addCity(city, trees);
                    break;

                case 2:
                    System.out.print("Enter city: ");
                    city = sc.nextLine();
                    System.out.println(service.findTrees(city));
                    break;

                case 3:
                    System.out.print("Enter city: ");
                    city = sc.nextLine();
                    service.deleteCity(city);
                    break;

                case 4:
                    service.displayAll();
                    break;

                case 0:
                    return;
            }
        }
    }
}