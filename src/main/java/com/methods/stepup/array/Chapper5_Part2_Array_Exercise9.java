package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise9 {
    public static void start() {
        int[] arr1 = {1,2,3,8,2,2,9};
        int x = 2;
        //Вызываем метод и получаем результат
        int [] result;
        result = findAll(arr1,x);
        System.out.println("результат: " + Arrays.toString(result));
    }

    //9 Массив с индексами всех вхождений числа x в массив
    public static int[] findAll(int[] arr, int x) {
        //Считаем количество вхождений
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                count++;
            }
            }
        // Создаем и заполняем массив
        int newArray[] = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                newArray[j++] = i;// записываем в следующую позицию результата и двигаем счетчик
            }
        }
        return newArray;
    }
}