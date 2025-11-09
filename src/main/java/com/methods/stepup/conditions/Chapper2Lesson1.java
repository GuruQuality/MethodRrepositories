package com.methods.stepup.conditions;

public class Chapper2Lesson1 {
    public static void run() {
        //1 задание Вычесление модуля
        int x = 5;
        System.out.println(" x = " + x + "\nрезультат " + Chapper2Lesson1.abs(x));
    }
    //Вычесление модуля
    public static int abs(int x){
        return x<0 ? x*-1 : x;
    }
}





