package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class TaskFromAida {
    public static void main(String[] args) {

        /**
         * 0 - 24
         * работаем - 9 - 17
         * обед - 13-14
         * не работаем - ????
         *
         * 25  жок
         * -1  жок
         *
         * if - else if
         *
         * */

        System.out.println("Введите время от 0 до 24 часов");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        switch (time) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8:
                System.out.println("В это время вы не работаете");
                break;
            case 9, 10, 11, 12:
                System.out.println("Вы работаете в это время");
                break;
            case 13, 14:
                System.out.println("У вас обед");
                break;
            case 15, 16, 17:
                System.out.println("Вы работаeте в это время");
                break;
            case 18, 19, 20, 21, 22, 23, 24:
                System.out.println("Вы не работаете в это время");
                break;

            default:
                System.out.println("В сутках нет такого времени исчисления");
                break;
        }




    }
}
