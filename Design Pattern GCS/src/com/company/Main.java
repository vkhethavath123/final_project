package com.company;

//Garbage collection system
//Singleton ✅
//Factory ✅
//Strategy ✅
//Proxy ✅

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Garbage garbage = Garbage.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            garbage.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                System.out.println("Select garbage type to dump:");
                System.out.println("1. Recyclable garbage");
                System.out.println("2. Non-Recyclable garbage");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    garbage.dumpGarbage("recycle");
                } else {
                    garbage.dumpGarbage("non-recycle");
                }
            }
            if (option == 2) {
                System.out.println("Which stats you want to see ?");
                System.out.println("1. Daily");
                System.out.println("2. Weekly");
                System.out.println("3. Monthly");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                garbage.displayStats(selection);

            }
            if (option == 3) {
                System.out.println("Login as an admin to approve garbage transport");
                System.out.println("1. Yes\n2. No");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    System.out.print("Enter name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    garbage.transportGarbage(user, pass);
                } else {
                    System.out.println("You can only transport garbage as an Admin!");
                }
            }
        }
    }
}
