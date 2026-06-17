package com.demo.test;

import com.demo.service.*;
import java.util.*;

public class TestCityTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CityTreeService service = new CityTreeServiceImpl();

        while (true) {
            System.out.println("\n1.Add City 2.Find Trees 3.Delete City 4.Display 5.Add Tree 6.Find Cities by Tree 0.Exit");
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

                case 5:
                    System.out.print("Enter city: ");
                    city = sc.nextLine();
                    System.out.print("Enter tree: ");
                    String tree = sc.nextLine();
                    service.addTree(city, tree);
                    break;

                case 6:
                    System.out.print("Enter tree: ");
                    tree = sc.nextLine();
                    service.findCitiesByTree(tree);
                    break;

                case 0:
                    return;
            }
        }
    }
}