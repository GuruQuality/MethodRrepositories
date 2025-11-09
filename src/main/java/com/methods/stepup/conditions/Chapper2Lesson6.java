package com.methods.stepup.conditions;

public class Chapper2Lesson6 {
    public static void run() {
        //6 Возврат true, если сумма 2-х равна третьему
        int x = 8;
        int y = -1;
        int z = 4;
        System.out.println(" x = " + x + " y = " + y + " z = " + z + "\nрезультат: " + Chapper2Lesson6.sum3(x, y, z));
    }

    //Возврат true, если сумма 2-х равна третьему
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        }
        if (y + z == x) {
            return true;
        }
        if (z + x == y) {
            return true;
        } else {
            return false;
        }
    }
}





