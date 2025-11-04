package com.methods.stepup;

public class Chapper2Lesson8 {
    public static void run() {
        //8 Проверка остатка от деления на 3 и 5, если оно делится и на 3,
        //и на 5, то вернуть надо false
        int x = 15;
        System.out.println(" x = " + x + "\nрезультат: " + Chapper2Lesson8.is35(x));
    }
    //Проверка остатка от деления на 3 и 5, если оно делится и на 3,
    //и на 5, то вернуть надо false
    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        if (x % 3 == 0) {
            return true;
        }
        if (x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}






