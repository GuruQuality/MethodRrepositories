package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise10 {
    public static void start() {
        int[] arr1 = {1,2,-3,4,-2,2,-5};
        //Вызываем метод и получаем результат
        int [] result;
        result =  deleteNegative(arr1);
        System.out.println("результат: " + Arrays.toString(result));
    }

    //10 Массив с все элементы массива arr кроме отрицательных
    public static int[] deleteNegative(int[] arr) {
        //Считаем количество вхождений положительных чисел
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                count++;
            }
            }
        // Создаем и заполняем массив
        int newArray[] = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                newArray[j++] = arr[i];// записываем в следующую позицию результата и двигаем счетчик
            }
        }
        return newArray;
    }
}