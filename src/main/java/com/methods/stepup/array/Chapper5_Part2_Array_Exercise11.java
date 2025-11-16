package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise11 {
    public static void start() {
        int[] arr = {1,2,3,4,5};
        int x = 9;
        int pos=3;
        //Вызываем метод и получаем результат
        int [] result;
        result =  add(arr,x,pos);
        System.out.println("результат: " + Arrays.toString(result));
    }

    //11 Массив вставляет элимент на идекс х в переданный массив
    public static int[] add(int[] arr , int x, int pos) {
        // Создаем и заполняем массив
        int newArr[]= new int[arr.length+1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }
}
