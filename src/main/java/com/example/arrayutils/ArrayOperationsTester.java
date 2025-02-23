package com.example.arrayutils;

import java.util.Scanner;

class ArrayOperationsTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            DynamicArrayManager manager = new DynamicArrayManager();
            manager.initializeArray();

            manager.insertNumber();
            manager.removeNumber();

            System.out.println("Choose an option:");
            System.out.println("C - Continue");
            System.out.println("X - Exit");
            String choice = scanner.next().toUpperCase();

            if (choice.equals("X")) {
                break;
            }
        }

        scanner.close();
    }
}