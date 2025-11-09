package com.methods.stepup;

public class Chapper5_Exercise10 {
    public static void start() {
        //Циклы #8 Левый треугольник.
        int x = 3;
        int count = 0;
        boolean success=false;
        do {
            count += 1;
            success = Chapper5_Exercise10.tryGuessGame(x);
        }
        while (!success);
        System.out.println("x = " + x + "\nУгадал с попытки: " + count);
    }

    //Циклы #8 Левый треугольник
    public static boolean tryGuessGame(int randomNum) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        if (x != randomNum) {
            System.out.println("No, try again");
            return false;
        } else {
            System.out.println("Yes, it`s " + randomNum);
            return true;
        }
    }
}