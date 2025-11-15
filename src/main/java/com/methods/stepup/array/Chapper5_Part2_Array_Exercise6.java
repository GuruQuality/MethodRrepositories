package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise6 {
    public static void start() {
        int[] arr = {1, 2, 3, 4, 5};
        //Вызываем метод и получаем результат
        System.out.println("Массив задом-наперед ");
        Chapper5_Part2_Array_Exercise6.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //6 Реверс
    public static void reverse(int arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            // Меняем местами элементы с начала и конца
            int num=arr[i];
            arr[i]=arr[arr.length-1 -i];
            arr[arr.length-1 -i]=num;
        }
    }
}