package com.methods.stepup.conditions;
public class Chapper2Lesson10 {
    public static void run() {
        //10 AgeChecker
        int x = 44;
        System.out.println(" x = " + x + "\nрезультат: " + Chapper2Lesson10.age(x));
    }
    //AgeChecker
    public static String age(int x) {
        int lastNumer = x % 10;
        int lastTwoNumers = x % 100;
        if (lastTwoNumers >= 11 && lastTwoNumers <= 14) {
            return x + " лет";
        }
        if (lastNumer == 1) {
            return x + " год";
        }
        if (lastNumer >= 2 && lastNumer <= 4) {
            return x + " года";
        }
        return x + " лет";
    }
}






