package com.methods.stepup.cycle;

public class Chapper5_Exercise3 {
    public static void start() {
        //Циклы #3 Возрат четных чисел числа
        int x = 9;
        System.out.println(" x = " + x + "\nрезультат: " + Chapper5_Exercise3.chet(x));
    }

    //Циклы #3 Возрат четных чисел числа
    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i+=2) {  // ← исправлено на res += x
            res += i + " ";
        }
        return res;
    }

}
