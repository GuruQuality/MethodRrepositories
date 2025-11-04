package com.methods.stepup;

import javax.xml.transform.Source;

import static java.lang.Integer.sum;

public class Methods {
    public static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static char toLowerCase(char ch) {
        int diff = 'a' - 'A';
        int res = ch - diff;
        return (char) res;
    }

    public static char toUpperCase(char ch) {
        int diff = 'a' - 'A';
        int res = ch - diff;
        return (char) res;
    }

    //Возрат дробной части числа
    public static double fraction(double x) {
        int a = (int) x;
        double b = (x - a);
        //Math.round- встроенная функция округления
        return (b);
    }

    //Сложение 2-х последних чисел
    public static int sumLastNum(int x) {
        int lastDigit = x % 10; //(% 10) запоминаем последнне число
        int secondDigit = (x / 10) % 10;// (/10)удаляем полседенее число
        return x = lastDigit + secondDigit;
    }

    //Преобразовние символ-цифры в соответствующее ей число -Подсказка: код символа ‘0’ — это число 48
    public static int charToNum(char x) {
        return x - 48;
    }

    // Проверка позитивности числа
    public static boolean isPositive(int x) {
        return x>0;
    }

    //Проверка двухзначности числа
    public static boolean is2Digits(int x) {
        if (x <= 0) {
            System.out.println("Число не положительное");
            return false;
        } else {
            if (x < 10) {
                return false;
            }
            if (x < 100) {
                return true;
            } else {
                return false;
            }
        }
    }

    //Проверка регистра
    public static boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    //Проверка диапазона
    public static boolean isInRange(int a, int b, int num) {
        if (a > b && num >= b && num <= a) {
            return true;
        }
        if (b > a && num >= a && num <= b) {
            return true;
        } else {
            return false;
        }
    }
    //Проверка остатка от деления
    public static boolean isDivisor (int a, int b){
        return a%b==0;//Проверяем остаток от деления
    }
    // Проверка равности трех чисел
    public static boolean isEqual (int a, int b, int c){
       return a==b && a==c;
    }
}




