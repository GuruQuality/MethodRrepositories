package com.methods.stepup;

public class Chapper2Lesson4 {
    public static void run() {
        //4 Сравнение чисел
        int x = 8;
        int y = 1;
        System.out.println(" x = " + x + " y = " + y + "\nрезультат " + Chapper2Lesson4.makeDecision(x, y));
    }

    //Сравнение чисел
    public static String makeDecision(int x, int y) {
        String a = "";
        String b = "";
        return x > y ? x + " > " + y : (x < y ? x + " < " + y : x + " == " + y);
    }
}





