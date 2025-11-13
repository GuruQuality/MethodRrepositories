package com.methods.stepup.cycle;

public class Chapper5_Exercise6 {
    public static void start() {
        //Циклы #5 Проверка на одинаковость числа
        int x = 11122;
        System.out.println("x = " + x + "\nрезультат: " + Chapper5_Exercise6.equalNum(x));
    }

    //Циклы #5 Проверка на одинаковость числа
    public static boolean equalNum(int x) {
        int lastDigit = x % 10;
        while (x != 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
}