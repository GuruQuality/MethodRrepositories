package com.methods.stepup.conditions;
public class Chapper2Lesson5 {
    public static void run() {
        //5 Максимальное трех чисел
        int x = 6;
        int y = 6;
        int z = 2;
        System.out.println(" x = " + x + " y = " + y +  " z = " + z +"\nрезультат " + Chapper2Lesson5.max3(x, y, z));
    }
    //Максимальное трех чисел
    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max)
            max = y;
        if (z > max) {
            max = z;
        }
        return max;
    }
}