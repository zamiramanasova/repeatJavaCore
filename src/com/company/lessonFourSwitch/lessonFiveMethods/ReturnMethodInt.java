package com.company.lessonFourSwitch.lessonFiveMethods;

import java.util.Scanner;

public class ReturnMethodInt {

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("a = " + a);
        return a;
    }

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner in =new Scanner(System.in);

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значение result = " + result);
        result = 10;
        // в качестве аргумента передается не сама переменная = result, а ее копия
        result = addTwo(result);
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
