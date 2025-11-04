package com.methods.stepup;

public class Chapper2Lesson11 {
    public static void run() {
        //DaysWeeks
        int x = 5;
        System.out.println(" x = " + x + "\nрезультат: " + Chapper2Lesson11.day(x));
    }

    //DaysWeeks
    public static String day(int x) {
        String result = "";
        switch (x) {
            case 1:
                result = "понедельник";
                break;
            case 2:
                result = "вторник";
                break;
            case 3:
                result = "среда";
                break;
            case 4:
                result = "четверг";
                break;
            case 5:
                result = "пятница";
                break;
            case 6:
                result = "суббота";
                break;
            case 7:
                result = "воскресенье";
                break;
            default:
                result = "это не день недели";
                break;
        }
        return result;
    }
}






