package com.methods.stepup;
public class App
{
    public static void main( String[] args )
    {
        double result = Methods.fraction(5.3);
        System.out.println("Дробная часть 5.3: " + result);
    }
    /*Вызов метода из другого класса - пример
        public static void SuperHello (String name) {
        char ch=name.charAt(0);
        ch= Methods.toLowerCase(ch);
        name=ch+name.substring(1);
        System.out.println("hello"+ name + "!");
    }
     */




}
