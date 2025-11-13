package com.methods.stepup.cycle;

public class Chapper5_Exercise2 {
    public static void start() {
        //Циклы #2 Запоминание чисел в обратном подрядке
        int x = 10;
        System.out.println(" x = " + x + "\nрезультат: " + Chapper5_Exercise2.reverseListNums(x));
    }

    //Циклы #2 Запоминание чисел в обратном подрядке
    public static String reverseListNums(int x) {
        String res = "";
        if (x < 0) {
            res = "x может принимать значения от 0 и выше";
        } else {
            for (int i = x; i >= 0; i--) {  // ← исправлено на res += x
                res += i + " ";
            }
        }
        return res;
    }

}
