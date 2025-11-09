package com.methods.stepup.conditions;

public class Chapper2Lesson3 {
    public static void run() {
        //3 Возрат максимального числа
        int x = 8;
        int y = -1;
        System.out.println(" x = " + x + " y = " +  y + "\nрезультат " + Chapper2Lesson3.max(x,y));
    }
    //Возрат максимального числа
    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}





