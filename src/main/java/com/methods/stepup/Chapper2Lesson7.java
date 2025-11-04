package com.methods.stepup;

public class Chapper2Lesson7 {
    public static void run() {
        //7 Возврат суммы, если сумма попадает в диапазон от [10, 19], то возрат 20
        int x = 8;
        int y = -1;
        System.out.println(" x = " + x + " y = " + y + "\nрезультат: " + Chapper2Lesson7.sum2(x, y));
    }
    //Возврат суммы, если сумма попадает в диапазон от [10, 19], то возрат 20
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
}





