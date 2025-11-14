package com.methods.stepup.array;

public class Chapper5_Part2_Array_Exercise2 {
    public static void start() {
        int x = 1;
        int[] arr = {1, 5, 3, 4, 5};
        //Вызываем метод и получаем результат
        int result = Chapper5_Part2_Array_Exercise2.findLast(arr, x);
        System.out.println("Индекс последнего вхождения:" + result);
    }

    //1 Поиск последнего значения
    public static int findLast(int arr[], int x) {
        for (int i = arr.length - 1; i >= 0; i--) {// внутри цикла полка i положительное или 0
            if (x == arr[i]) {
                return i;//возращаем индекс i
            }
        }
        return -1;//возращаем -1 если не наши
    }
}
//public static int findLast(int[] arr, int x);
//Необходимо реализовать метод таким образом, чтобы
//он возвращал индекс последнего вхождения числа x в
//массив arr. Если число не входит в массив – возвращается
//-1.
//
//Пример:
//arr=[1,2,3,4,2,2,5]
//x=2
//результат: 5