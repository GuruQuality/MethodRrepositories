package com.methods.stepup;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1 Задание - Возрат дробной части
        double result = Methods.fraction(5.3);
        System.out.println("Дробная часть 5.3: " + Math.round(result * 1000.0) / 1000.0);
        System.out.println();
        //2 Задание - Сумма 2-х последних знаков числа
        int number=18;
        if (number < 10) {
            System.out.print("Число должно иметь две цифры");
        } else {
            System.out.println("Сумма последних двух чисел: " + Methods.sumLastNum(number));
        }
        System.out.println();
        //3 задание Преобразовние символ-цифры в соответствующее ей число
        int symbol=Methods.charToNum('3');
        System.out.println("Результат преобразования числа '3': " + symbol);
        System.out.println();
        //4 задание Проверка позитивности числа
        System.out.println("Проверка позитивности числа");
        System.out.println("x=0, результат: " + Methods.isPositive(0));
        System.out.println("x=3, результат: " + Methods.isPositive(3));
        System.out.println("x=-5, результат: " + Methods.isPositive(-5));
        System.out.println();
        //5 задание Проверка позитивности числа
        System.out.println("Проверка двухзначности числа");
        System.out.println("x=-2, результат: " + Methods.is2Digits(-2));
        System.out.println("x=2, результат: " + Methods.is2Digits(2));
        System.out.println("x=12, результат: " + Methods.is2Digits(12));
        System.out.println("x=100, результат: " + Methods.is2Digits(100));
        System.out.println();
        //6 задание Проверка регистра
        System.out.println("Проверка регистра");
        System.out.println("x=’D’, результат:" + Methods.isUpperCase('D'));
        System.out.println("x=’q’, результат:" + Methods.isUpperCase('q'));
        System.out.println();
        //6 задание Диапазона
        System.out.println("Проверка что число входит в диапазон чисел");
        //7 задание Scanner (тип) данных scanner (название переменной) = new Scanner(из какоког класса значение берем)(System.in);
        Scanner leftBorder = new Scanner(System.in);
        System.out.print("Введите число левой границы (число): ");
        // Читаем число и сохраняем его в переменную - nextInt (метод)- ожидает ввод пользователя,
        int lefBordInt = leftBorder.nextInt();

        Scanner rightBorder = new Scanner(System.in);
        System.out.print("Введите число правой границы (число): ");
        // Читаем число и сохраняем его в переменную - nextInt (метод)- ожидает ввод пользователя,
        int rightBorderInt = rightBorder.nextInt();

        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        // Читаем число и сохраняем его в переменную - nextInt (метод)- ожидает ввод пользователя,
        int numInt = num.nextInt();
        System.out.println("Ответ: " + Methods.isInRange(lefBordInt,rightBorderInt,numInt));
        System.out.println();
        //8 задание Проверка остатка от деления
        System.out.println("Делится ли нацело 6/3?" + " " + Methods.isDivisor(6,3));
        System.out.println("Делится ли нацело 2/15?" + " " + Methods.isDivisor(2,15));
        System.out.println();
    }
}
