package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class TernaryOperation {

    public static void main(String[] args) {
        int a = 1, b = 2, max = 0;

        max = (a > b) ? a : b;
        System.out.println(max);

        // тернарный оператор должен обязательно что то возвращать иначе будет ошибка.

        int z = 1, d = 2, m = -5, max1 = 0;

        max1 = z > d ? (m = z) : (m = d);
        System.out.println(max1);


        String string = "Hello";
        System.out.println("Введите свой логин");

        Scanner in = new Scanner(System.in);

        String login = in.next();

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);

    }
}

