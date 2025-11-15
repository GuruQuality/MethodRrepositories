package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise7 {
    public static void start() {
        int[] arr = {1, 2, 3, 4, 5};
        //Вызываем метод и получаем результат
        int [] result = new int [arr.length];
        result = reverseBack(arr);
        System.out.println("результат: " + Arrays.toString(result));
    }

    //7 Реверс в новом массиве
    public static int[] reverseBack(int arr[]) {
        int arr2[] = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[arr.length-1-i];
        }
        return arr2;
    }
}