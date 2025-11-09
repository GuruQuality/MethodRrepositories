package com.methods.stepup;

public class Chapper5_Exercise4 {
    public static void start() {
        //Циклы #4 Возведение х в степень у
        int x = 2;
        int y = 5;
        System.out.println("x = " + x + " \ny = " + y + "\nрезультат: " + Chapper5_Exercise4.pow(x, y));
    }

    //Циклы #4 Возведение х в степень у
    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res = res * x;
        }
        return res;
    }

}
//для получения степени необходимо умножить единицу на число x, и сделать
//это y раз, т.е.
//два в третьей степени это 1*2*2*2
//
//Пример:
//x=2
//y=5
//результат: 32