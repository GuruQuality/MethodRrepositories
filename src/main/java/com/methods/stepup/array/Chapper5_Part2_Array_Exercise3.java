package com.methods.stepup.array;

public class Chapper5_Part2_Array_Exercise3 {
    public static void start() {
        int[] arr = {-1, -5, -9, 4, 7};
        //Вызываем метод и получаем результат
        int result = Chapper5_Part2_Array_Exercise3.maxAbs(arr);
        System.out.println("Маскимальный абсолют числа в массиве:" + result);
    }

    //3 Поиск максимального
    public static int maxAbs(int arr[]) {
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {// внутри цикла полка i положительное или 0
            int posetiveNumber = Math.abs(arr[i]);//Методе возращает абсолют числа
            max = Math.max(max, posetiveNumber);//Метод выбирает больешее из двух max и posetiveNumber
        }
        return max;
    }
}