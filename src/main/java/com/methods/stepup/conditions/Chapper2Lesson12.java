package com.methods.stepup.conditions;

public class Chapper2Lesson12 {
    public static void run() {
        //DaysWeeks
        String x = "среда";
        System.out.println(" x = " + x + "\nрезультат: " + Chapper2Lesson12.printDays(x));
    }

    //DaysWeeks
    public static String printDays(String x) {
        String result = "";
        switch (x) {
            case "понедельник":
                result += "\nпонедельник";
            case "вторник":
                result += "\nвторник";
            case "среда":
                result += "\nсреда";
            case "четверг":
                result += "\nчетверг";
            case "пятница":
                result += "\nпятница";
            case "суббота":
                result += "\nсуббота";
            case "воскресенье":
                result += "\nвоскресенье";
                break;
            default:
                result = "\nэто не день недели";
        }
        return result;
    }
}






