package com.methods.stepup.cycle;

public class Chapper5_Exercise8 {
    public static void start() {
        //Циклы #8 Левый треугольник.
        int x = 3;
        System.out.println("x = " + x + "\nрезультат: ");
        Chapper5_Exercise8.leftTriangle(x);
    }

    //Циклы #8 Левый треугольник.
    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {//ряд
            for (int j = 1; j <= i; j++) {//строки
                System.out.print("*");
            }
            if (i < x) {
                System.out.println();
            }
        }
    }
}