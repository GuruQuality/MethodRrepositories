package com.methods.stepup.array;

import java.util.Arrays;

public class Chapper5_Part2_Array_Exercise12 {
    public static void start() {
        int[] arr = {1,2,3,4,5};
        int[] ins = {7,8,9};
        int pos=3;
        //Вызываем метод и получаем результат
        int [] result;
        result =  add(arr,ins,pos);
        System.out.println("результат: " + Arrays.toString(result));
    }

    //12 Новый массив со всеми элементами массива arr, в позицию pos вставлены значения массива ins
    public static int[] add(int[] arr ,int[] ins, int pos) {
        // Создаем и заполняем массив
        int j=0;
        int newArr[]= new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {//перебор массива arr до pos
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {//перебор массива ins
            newArr[pos+i] = ins[i];
            j++;
        }
        for (int i = pos; i < arr.length; i++) {//перебор массива arr после pos
            newArr[ins.length+i] = arr[i];
        }
        return newArr;
    }
}
