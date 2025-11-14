package com.methods.stepup.array;

public class Chapper5_Part2_Array_Exercise4 {
    public static void start() {
        int[] arr = {-1, -5, -9, 4, 7, 9, 11, 11111};
        //Вызываем метод и получаем результат
        int result = Chapper5_Part2_Array_Exercise4.countPositive(arr);
        System.out.println("Количество положительных элементов в массиве:" + result);
    }

    //4 Подсчет позитива
    public static int countPositive(int arr[]) {
        int result = 0;
        for (int i = arr.length - 1; i >= 0; i--) {// внутри цикла полка i положительное или 0
            if (arr[i] > 0) result++;
        }
        return result;
    }
}