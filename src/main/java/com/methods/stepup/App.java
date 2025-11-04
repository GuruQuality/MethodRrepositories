package com.methods.stepup;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1 Задание - Возрат дробной части
        double result = Methods.fraction(5.3);
        System.out.println("Дробная часть 5.3: " + Math.round(result * 1000.0) / 1000.0);
        //2 Задание - Сумма 2-х последних знаков числа
        int number=18;
        if (number < 10) {
            System.out.print("Число должно иметь две цифры");
        } else {
            System.out.println("Сумма последних двух чисел: " + Methods.sumLastNum(number));
        }
    }
}
