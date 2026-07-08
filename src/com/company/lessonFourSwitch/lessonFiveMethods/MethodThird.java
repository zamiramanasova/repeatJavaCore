package com.company.lessonFourSwitch.lessonFiveMethods;

import java.util.Scanner;

public class MethodThird {

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);

        // принимаем ввод от пользователя и преобразуем его в целочисленное значение
        String number = in.next();
        int result = Integer.parseInt(number);
        System.out.println("Значение result = " + result);

        // присвоим переменной result значение, возвращенное методом addTwo();
        result = addTwo(result);
        System.out.println("Значение result = " + result);
    }

}
