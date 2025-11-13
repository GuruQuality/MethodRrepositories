package com.methods.stepup.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise1 {
    public static void start() {
        int x = 9;
        int[] arr = {1, 5, 3, 4, 5};
        //Вызываем метод и получаем результат
        int result = Chapper5_Part2_Array_Exercise1.findFirst(arr, x);
        System.out.println("Индекс первого вхождения:" + result);
    }

    //1 Поиск первого значения
    public static int findFirst(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;//возращаем индекс i
            }
        }
        return -1;//возращаем -1 если не наши
    }
}
