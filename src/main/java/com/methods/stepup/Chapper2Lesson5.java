package com.methods.stepup;

public class Chapper2Lesson5 {
    public static void run() {
        //5 Максимальное трех чисел
        int x = 5;
        int y = 7;
        int z = 7;
        System.out.println(" x = " + x + " y = " + y +  " z = " + z +"\nрезультат " + Chapper2Lesson5.max3(x, y, z));
    }
    //Максимальное трех чисел
    public static int max3(int x, int y, int z) {
        if (x > y && x > z)
            return x;

        if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }
}





