package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImpl;

public class TestVehicle {

    public static void main(String[] args) {

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        VehicleService vservice = new VehicleServiceImpl();

        do {
            System.out.println("\n1.Add Vehicle\n2.Delete By Id\n3.Modify By Id\n4.Display All\n5.Display By Id\n6.Display By Name\n7.Display By Price\n8.Sort By Id\n9.Sort By Name\n10.Sort By Price\n11.Save To File\n12.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    boolean status = vservice.addNewVehicle();
                    System.out.println(status ? "Vehicle added" : "Not added");
                    break;
                }

                case 2: {
                    System.out.println("Enter id to delete:");
                    int id = sc.nextInt();
                    boolean status = vservice.deleteById(id);
                    System.out.println(status ? "Deleted successfully" : "Not found");
                    break;
                }

                case 3: {
                    System.out.println("Enter id to update:");
                    int id = sc.nextInt();
                    System.out.println("Enter new price:");
                    double price = sc.nextDouble();
                    boolean status = vservice.updateById(id, price);
                    System.out.println(status ? "Updated successfully" : "Not found");
                    break;
                }

                case 4: {
                    Set<Vehicle> vs = vservice.getAll();
                    vs.forEach(System.out::println);
                    break;
                }

                case 5: {
                    System.out.println("Enter id:");
                    int id = sc.nextInt();
                    Vehicle v = vservice.getById(id);
                    System.out.println(v != null ? v : "Not found");
                    break;
                }

                case 6: {
                    System.out.println("Enter name:");
                    String name = sc.next();
                    List<Vehicle> list = vservice.getByName(name);
                    if (list != null && !list.isEmpty()) {
                        list.forEach(System.out::println);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                }

                case 7: {
                    System.out.println("Enter price:");
                    double price = sc.nextDouble();
                    List<Vehicle> list = vservice.getByPrice(price);
                    if (list != null && !list.isEmpty()) {
                        list.forEach(System.out::println);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                }

                case 8: {
                    Set<Vehicle> vset = vservice.sortById();
                    vset.forEach(System.out::println);
                    break;
                }

                case 9: {
                    List<Vehicle> vlist = vservice.sortByName();
                    vlist.forEach(System.out::println);
                    break;
                }

                case 10: {
                    List<Vehicle> vlist = vservice.sortByPrice();
                    vlist.forEach(System.out::println);
                    break;
                }

                case 11: {
                    vservice.writeToFile();
                    System.out.println("File saved successfully");
                    break;
                }

                case 12: {
                    System.out.println("Thank You!");
                    break;
                }

                default: {
                    System.out.println("Wrong Choice");
                }
            }

        } while (choice != 12);

        sc.close();
    }
}