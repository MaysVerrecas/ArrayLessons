package com.maysvr.homework;

import java.util.Arrays;

public class Task4 {
    /**
     * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
     * (нужно прибавить 1).
     */
    public static void main(String[] args) {
        int[] array = { 3, 4, 21, 6, 6, 9, 3, 1, 0};
        System.out.println(Arrays.toString(array)); // изначальный массив
        evenArray(array);
        System.out.println(Arrays.toString(array)); // исправленный
    }
    private static int[] evenArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        return array;
    }


}
