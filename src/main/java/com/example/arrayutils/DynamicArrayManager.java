package com.example.arrayutils;

import java.util.Scanner;

class DynamicArrayManager {
    private int[] array;
    private final Scanner scanner = new Scanner(System.in);

    void initializeArray() {
        System.out.print("Enter the initial size of the array: ");
        int size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Initial array:");
        displayArrayContents();
    }

    void insertNumber() {
        System.out.print("Give the index and value to insert at that index: ");
        int index = scanner.nextInt();
        int number = scanner.nextInt();
        array = ArrayOperations.insertAt(array, index, number);
        System.out.println("After inserting at index " + index + ":");
        displayArrayContents();
    }

    void removeNumber() {
        System.out.print("Enter the number to delete: ");
        int number = scanner.nextInt();
        array = ArrayOperations.removeAndShift(array, number);
        System.out.println("After deleting " + number + ":");
        displayArrayContents();
    }

    void displayArrayContents() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element [" + i + "]: " + array[i]);
        }
    }
}
