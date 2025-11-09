package com.methods.stepup;

public class Chapper5_Exercise5 {
    public static void start() {
        //Циклы #5 Количество знаков в числе x
        int x = 1234567890;
        System.out.println("x = " + x + "\nрезультат: " + Chapper5_Exercise5.numLen(x));
    }

    //Циклы #5 Количество знаков в числе x
    public static int numLen(long x) {
        int count = 0;
        if (x == 0) return 1;
        for (int i = 0; x != 0; i++) {
            x = x / 10;
            count += 1;
        }
        return count;
    }
}