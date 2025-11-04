package com.methods.stepup;

public class Chapper2Lesson2 {
    public static void run() {
        //2 Безопасное деление двух чисел
        int x = 5;
        int y = 0;
        System.out.println(" x = " + x + " y = " +  y + "\nрезультат " + Chapper2Lesson2.safeDiv(x,y));
    }
    //Безопасное деление двух чисел
    public static int safeDiv(int x, int y){
        return y == 0 ? 0 : x/y;
    }
}





