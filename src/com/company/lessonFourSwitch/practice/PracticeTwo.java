package com.company.lessonFourSwitch.practice;

import java.util.Locale;
import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        /**
         * Напишите программу на Java, в которой пользователю нужно предоставить один символ из алфавита.
         * Печать гласного или согласного, в зависимости от ввода пользователя.
         * Если пользовательский ввод не является буквой (между a и z или A и Z)
         * или является строкой длиной> 1, выведите сообщение об ошибке.
         */

//        System.out.println("Enter your letter");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next().toLowerCase();
//        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) < 90;
//        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                || input.equals("o") || input.equals("u");
//        if (input.length() > 1) {
//            System.out.println("Error not a single character");
//        } else if (! (uppercase || lowercase)) {
//            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
//        } else if (vowels) {
//            System.out.println("Input letter");
//        } else {
//            System.out.println("Input letter is Constant");
//        }

/**
 *  8
 *  Напишите программу на Java, от которой у пользователя уходит год,
 *  и напечатайте, является ли этот год високосным или нет.
 */
//        System.out.println("Enter your year");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        int a = 400;
//        int b = 4;
//        int c = 100;
//            if ((year % a == 0) || ((year % b == 0) && (year % c != 0))) {
//                System.out.println(year + " високосный год ");
//            } else {
//                System.out.println("простой год");
//        }

        /**
         * Напишите программу на Java для
         * отображения первых 10 натуральных чисел.
         */

        //       System.out.println("Numbers 1 to 10");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        /**
         * Напишите программу на Java для отображения n терминов натуральных чисел и их суммы.
         * Тестовые данные
         * Введите число: 2
         * Ожидаемый результат :
         *  Введите номер:
         * 2
         * Первые n натуральных чисел:
         * 2
         * 1
         * 2
         * Сумма натурального числа до n слагаемых:
         * 23
         */
//        System.out.println("Введите число: ");
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int number = sc.nextInt();
//        System.out.println("Первые number натуральных чисел");
//        System.out.println(number);
//            for (int i = 1; i <= number; i++) {
//                System.out.println(i);
//
//                sum+=i;
//            }
//        System.out.println("The sum " + number + sum);
//        }

        /**
         * Напишите программу на Java, чтобы ввести 5 цифр с клавиатуры и найти их сумму и среднее.
         *
         * Тестовые данные
         * Введите 5 цифр: 1 2 3 4 5
         */
//
//        int i, n = 0, s = 0;
//        double avg;
//        System.out.println("Введите 5 цифр:");
//
//        for (i = 0; i < 5; i++) {
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//
//            s += n;
//        }
//        avg = s / 5;
//        System.out.println("The sum of 5 no is : " + s + " Average is : " + avg);

        /**
         *             14
         * Напишите программу на Java, чтобы отобразить куб числа до заданного целого числа.
         *
         * Тестовые данные
         * Введите количество терминов: 4
         */

//        System.out.println("Enter your number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
//        }

        /**
         * Напишите программу на Java для отображения n терминов нечетного натурального числа и их суммы.
         * Тестовые данные
         * Введите количество терминов: 5
         */
//
//        System.out.println("Нечетные числа: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < a; i++) {
//            sum += a;
//        }
//        System.out.println("Сумма нечетного натурального числа до " + a + " слагаемых: " + sum);


        /**
         * 16
         * Напишите программу на Java для отображения шаблона в виде прямоугольного треугольника с номером.
         * Тестовые данные
         * Введите количество строк:
         */
//
//        System.out.println("Введите количество строк: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int f = 1; f <= i; f++) {
//                System.out.print(f);
//            }
//            System.out.println(" ");
//        }

        /**
         * Напишите программу на Java для создания такого шаблона,
         * как прямоугольный треугольник, с номером, который будет
         * повторять число в ряду. Шаблон выглядит следующим образом:
         */
//        System.out.println("Введите количество строк: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 1; i <= a; i++) {
//            for (int f = 1; f <= i; f++) {
//                System.out.print(i);
//            }
//            System.out.println(" ");
//        }

        /**
         * Напишите программу на Java, которая читает целое число и проверяет,
         * является ли оно отрицательным, нулевым или положительным.
         */
//        System.out.println("Enter you number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a > 0) {
//            System.out.println("Число положительное");
//        } else if (a == 0) {
//            System.out.println("Число равен нулю");
//        } else {
//            System.out.println("Номер отрицательный");
//            }

        /**   29
         * Напишите программу на Java, которая читает положительное
         * целое число и подсчитывает количество цифр, которое имеет число
         * (менее десяти миллиардов).
         */

        System.out.println("Enter you number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 100000) {
            if (a < 100) {
                if (a < 10) {
                    System.out.println("Колличество цифр: " + 1);
                } else {
                    System.out.println("Колличество цифр: " + 2);
                }
            } else {
                if (a < 1000) {
                    System.out.println("Колличество цифр: " + 3);
                } else {
                    if (a < 10000) {
                        System.out.println("Колличество цифр: " + 4);
                    } else {
                        System.out.println("Колличество цифр: " + 5);
                    }
                }
            }
        } else {
            if (a < 10000000) {
                if (a < 1000000) {
                    System.out.println("Колличество цифр: " + 6);
                } else {
                    System.out.println("Колличество цифр: " + 7);
                }
            } else {
                if (a < 100000000) {
                    System.out.println("Колличество цифр: " + 8);
                } else {
                    if (a < 1000000000) {
                        System.out.println("Колличество цифр: " + 9);
                    } else {
                        System.out.println("Колличество цифр: " + 10);
                    }
                }
            }
        }
    }
}