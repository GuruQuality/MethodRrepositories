package com.methods.stepup.cycle;

import java.io.File;
import java.util.Scanner;

public class Chapper5_CourseProject {
    public static void start() {
        int count = 1;
        while (true) {
            System.out.println("Введите путь к файлу");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean objectExists = file.exists();//Проверяем сущетсвет ли путь
            boolean isDirectory = file.isDirectory();//Проверяем что объект является папкой
            if (objectExists && !isDirectory) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
            } else {
                System.out.println("Путь указан не верно");
                continue;
            }
            count += 1;
        }
    }
}