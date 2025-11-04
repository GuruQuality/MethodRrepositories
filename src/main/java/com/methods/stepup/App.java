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
        //3 задание Преобразовние символ-цифры в соответствующее ей число
        int symbol=Methods.charToNum('3');
        System.out.println("Результат преобразования числа '3': " + symbol);
        //4 задание Проверка позитивности числа
        System.out.println("x=0, результат: " + Methods.isPositive(0));
        System.out.println("x=3, результат: " + Methods.isPositive(3));
        System.out.println("x=-5, результат: " + Methods.isPositive(-5));
    }
}
