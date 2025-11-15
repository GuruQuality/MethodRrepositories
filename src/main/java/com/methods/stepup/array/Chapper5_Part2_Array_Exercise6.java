package com.methods.stepup.array;

public class Chapper5_Part2_Array_Exercise6 {
    public static void start() {
        int[] arr = {1, 2, 3, 4, 5};
        //Вызываем метод и получаем результат
        System.out.println("Массив задом-наперед ");
        Chapper5_Part2_Array_Exercise6.reverse(arr);
    }

    //6 Реверс
    public static void reverse(int arr[]) {
        int arr2[] = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]=arr[arr.length-1-i]);
            System.out.print(" ");
        }
    }
}