package com.methods.stepup.cycle;

public class Chapper5_Exercise7 {
    public static void start() {
        //Циклы #7 Квадрат
        int x = 4;
        System.out.println("x = " + x + "\nрезультат: ");
        Chapper5_Exercise7.square(x);
    }

    //Циклы #7 Квадрат
    public static void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
