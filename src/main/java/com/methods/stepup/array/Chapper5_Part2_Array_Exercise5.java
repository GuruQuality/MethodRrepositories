package com.methods.stepup.array;

public class Chapper5_Part2_Array_Exercise5 {
    public static void start() {
        int[] arr = {1, -2, -7, 9, 9, -7, -2, 1};
        //Вызываем метод и получаем результат
        boolean result = Chapper5_Part2_Array_Exercise5.palindrom(arr);
        System.out.println("Число являеся палиндромом? " + result);
    }

    //5 Палиндром
    public static boolean palindrom(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {// внутри цикла полка i положительное или 0
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }

        }
        return true;
    }
}