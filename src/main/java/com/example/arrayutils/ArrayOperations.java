package com.example.arrayutils;

// ArrayOperations Class (static methods)
class ArrayOperations {
    static int[] insertNumberAtPosition(int[] array, int index, int number) {
        // Check if the value at the specified index is zero and replace it directly.
        if (array[index] == 0) {
            array[index] = number;
            return array;
        }
        // Check for empty slots (0 values) in the array to insert the number directly.
        boolean inserted = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = array.length - 1; j > index; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = number;
                inserted = true;
                break;
            }
        }
        // If no space is available, create a larger array.
        if (!inserted) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = number;
            for (int i = index; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            return newArray;
        }
        return array;
    }

    static int[] removeNumberAndShift(int[] array, int number) {
        // Find the index of the target number (assume it exists and is unique).
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Number not found: " + number);
            return array; // Number not found
        }
        // Shift subsequent elements up by one position.
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        // Set the last element to 0.
        array[array.length - 1] = 0;
        return array;
    }
}