package com.maysvr.homework;

public class Task2_3 {
    public static void main(String[] args) {
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"Ну", "привет", "папаша"};
        int[] array1 = {1, 2, 3};

        printIntArray(array1);
        printDoubleArray(array2);
        printStringArray(array3);

        System.out.println("Task 3  :");

        printIntArrayReverse(array1);
        printDoubleArrayReverse(array2);
        printStringArrayReverse(array3);


    }

    private static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    private static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    private static void printIntArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
    private static void printDoubleArrayReverse(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
    private static void printStringArrayReverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

}
