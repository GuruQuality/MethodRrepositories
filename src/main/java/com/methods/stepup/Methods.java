package com.methods.stepup;

public class Methods {

    public static boolean isLowerCase(char ch){
        return ch>='a'&&ch<='z';
    }

    public static char toLowerCase(char ch){
        int diff='a'-'A';
        int res=ch-diff;
        return (char)res;
    }

    public static char toUpperCase(char ch){
        int diff='a'-'A';
        int res=ch-diff;
        return (char)res;
    }

    //Возрат дробной части числа
    public static double fraction(double x){
        int a=(int)x;
        double b=(x-a);
        //Math.round- встроенная функция округления
        return Math.round(b*1000.0)/1000.0;

    }


}
