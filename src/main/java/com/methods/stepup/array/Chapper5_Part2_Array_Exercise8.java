package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise8 {
    public static void start() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7,8,9};
        //Вызываем метод и получаем результат
        int [] result;
        result = concat(arr1,arr2);
        System.out.println("результат: " + Arrays.toString(result));
    }

    //8 Массив с д-мя элементами двух массивов
    public static int[] concat(int[] arr1, int[] arr2) {
        int newArray[] = new int [arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[arr1.length+i]=arr2[i];
        }
        return newArray;
    }
}