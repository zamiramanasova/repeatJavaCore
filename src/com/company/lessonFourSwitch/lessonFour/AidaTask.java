package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class AidaTask {

    public static void main(String[] args) {

        /**
         * 0 - 24
         * работаем - 9 - 17
         * обед - 13-14
         * не работаем - ????
         * 25  жок
         * -1  жок
         * if - else if
         * */
        System.out.println("Введите время: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a >= 9 && a < 13) || (a >= 15 && a <= 17)) {
            System.out.println("Вы работаете");
        } else if (a == 13 || a == 14) {
            System.out.println("У вас перерыв");
        } else if ((a >= 18 && a <= 24) || (a < 9 && a >= 0)) {
            System.out.println("Вы не работаете");
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }

/*    if (a >= 9 && a < 13) {
        System.out.println("Вы работаете");
    } else if (a == 13 || a == 14) {
        System.out.println("У вас перерыв");
    } else if (a >= 15 && a <= 17) {
        System.out.println("Вы так же работаете");
    } else if (a >= 18 && a <= 24) {
        System.out.println("Вы не работаете");
    } else if (a < 9 && a >= 0) {
        System.out.println("Вы не работаете");
    } else {
        System.out.println("Вы ввели неверное число");
    }*/
}
