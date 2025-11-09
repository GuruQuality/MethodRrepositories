package com.methods.stepup;

public class Chapper5_Exercise1 {
    public static void start() {
        //Циклы #1 Запоминание числе подряд.
        int x = 5;
        System.out.println(" x = " + x + "\nрезультат: " + Chapper5_Exercise1.listNums(x));
    }

    //Циклы #1 Запоминание числе подряд.
    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {  // ← исправлено на res += x
            res += i + " ";
        }
        return res;
    }
}
