package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class HomeWorkAida {

    public static void main(String[] args) {

        /**
         * 5. используем Scanner Целое число через консоль - если положительное вывести на консоль,
         * если отрицательное - сделать положительным
         * Scanner колдонуп сан беребиз - ал сан он сан - консольго санды чыгарабыз,
         * терс сан - аны он санга которуп - консольго чыыгарабыз.
         * 0 -> 0
         */

//        System.out.println("Just input Scanner");
//
//        Scanner input = new Scanner(System.in);
//        int buffer = input.nextInt();
//        if (buffer > 0) {
//            System.out.println(buffer);
//        } else if (buffer < 0) {
//            System.out.println(Math.abs(buffer));
//        }

/**
 * 2. используем Scanner Целое число через консоль - определить последняя цифра 5 - да, если нет - нет
 * Scanner колдонуп сан беребиз 56745- ал сандын акыркы сааны 5 - жообу ооба- болбосо жок
 */

//        System.out.println("Just input Scanner");
//
//
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if (number % 10 == 5) {
//            System.out.println("Ooba");
//        } else {
//            System.out.println("Жок");
//        }

        /**
         * 6. используем Scanner 3 целых числа через консоль и один из операторов - + / * ,
         * если +, то находим сумму
         * если -, то находим разницу
         * если /
         * если *
         * Если ввели неапвильный оператор - выводим НЕТ
         * Scanner колдонуп 3 сан беребиз - бир оператор - + / *,
         * оператор + сандардын суммасын табабыз
         * -
         * *
         * /
         * Туура эмес оператор берсе - андай оператор жок
         */


        Scanner sc = new Scanner(System.in);
        String count = sc.nextLine();
        System.out.println("Введите три числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        switch (count) {

            case "-":
                System.out.println(a - b - c);
                break;
            case "+":
                System.out.println(a + b + c);
                break;
            case "/":
                System.out.println(a / b / c);
                break;
            case "*":
                System.out.println(a * b * c);
                break;

            default:
                System.out.println("Вы ввели не правильный знак");
        }
    }
}



