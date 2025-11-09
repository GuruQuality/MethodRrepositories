package com.methods.stepup.conditions;
public class Chapper2Lesson9 {
    public static void run() {
        //Проверка true, если одно из
        //принятых методом чисел равно шести, или их сумма равна шести, или разница между
        //ними равна шести
        int x = -1;
        int y = -7;
        System.out.println(" x = " + x + " y = " + y + "\nрезультат: " + Chapper2Lesson9.magic6(x, y));
    }
    //Проверка true, если одно из
    //принятых методом чисел равно шести, или их сумма равна шести, или разница между
    //ними равна шести
    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6) {
            return true;
        }
        if (x + y == 6) {
            return true;
        }
        return Math.abs(x-y) == 6;
    }
}






