package com.methods.stepup.cycle;

public class Chapper5_Exercise9 {
    public static void start() {
        //Циклы #8 Левый треугольник.
        int x = 3;
        System.out.println("x = " + x + "\nрезультат: ");
        Chapper5_Exercise9.rightTriangle(x);
    }

    //Циклы #8 Левый треугольник.
    public static void rightTriangle(int x) {
        int row = 1;
        for (int i = 1; i <= x; i++) {//ряд
            for (int j = 1; j <= x - i; j++) {//пробелы
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {//строки
                System.out.print(" *");
            }
            System.out.println("");
            row += 1;
        }
    }
}