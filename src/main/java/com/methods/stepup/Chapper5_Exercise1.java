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

//Практика Java. Циклы #1
//Числа подряд. Дана следующая сигнатура
//метода:
//
//public static String listNums(int x);
//Необходимо реализовать метод таким образом, чтобы
//он возвращал строку, в которой будут записаны все числа от 0 до x (включительно). x может принимать значения от 0 и выше.
//
//Пример:
//x=5
//результат: “0 1 2 3 4 5”
//Ответ №1
//