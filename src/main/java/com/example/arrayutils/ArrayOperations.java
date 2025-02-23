package com.example.arrayutils;

class ArrayOperations {

    static int[] insertAt(int[] array, int index, int value) {
        if (index < 0 || index > array.length) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        boolean hasEmptySlot = false;
        for (int num : array) {
            if (num == 0) {
                hasEmptySlot = true;
                break;
            }
        }

        if (hasEmptySlot) {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            return array;
        } else {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            System.arraycopy(array, index, newArray, index + 1, array.length - index);
            return newArray;
        }
    }

    static int[] removeAndShift(int[] array, int number) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Number not found: " + number);
            return array;
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;

        return array;
    }
}