package com.company.lessonFourSwitch.practice;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {


        /**
         * задача нужно символ char
         * вывести как int, потому что при выводе char символ выводит не само число, а порядковый номер.
         */

//        char num = '1';
//        int ch = num - '0';
//        System.out.println(num);
//        System.out.println(ch);


        /**
         *  1  Напишите программу на Java,
         * чтобы получить число от пользователя,
         * и распечатайте, является ли оно положительным
         * или отрицательным.
         */

//        System.out.println("Введите число: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a > 0) {
//            System.out.println("Положительное число");
//        } else if (a < 0) {
//            System.out.println("Отрицательное число");
//        }

        /**
         *  Напишите программу на Java для решения
         *  квадратных уравнений (используйте if, else if и else)
         *  Тестовые данные
         * Введите: 1
         * Вход б: 5
         * Вход c: 1
         * Ожидаемый результат :
         * Корни -0.20871215252208009 и -4.7912878474779195
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число а: ");
//        double a = sc.nextDouble();
//        System.out.print("Введите число б ");
//        double b = sc.nextDouble();
//        System.out.print("Введите число с ");
//        double c = sc.nextDouble();
//        double result = b * b - 4 * a * c;

//        if (result > 0.0) {
//            double result1 = (-b - Math.sqrt(0.5)) / (2.0 * a);
//            double result2 = (-b + Math.sqrt(0.5)) / (2.0 * a);
//            System.out.println("Корни уравнения: х1 = " + result1 + "x2 = " + result2);
//        } else if (result == 0.0) {
//            double result1 = -b / (2.0 * a);
//            System.out.println("Уравнение имеет единственный корень: x = " + result1);
//        } else {
//            System.out.println("Уравнение не имеет действительных корней");
//        }

        /**
         *  Возьмите три цифры у пользователя
         *  и напечатайте наибольшее число.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число а: ");
//        int a = sc.nextInt();
//        System.out.print("Введите число б ");
//        int b = sc.nextInt();
//        System.out.print("Введите число с ");
//        int c = sc.nextInt();

//        if (a > b && a > c) {
//            System.out.println(a);
//        } else if (b > a && b > c) {
//            System.out.println(b);
//        } else if (c > a && c > b) {
//            System.out.println(c);
//        } else {
//            System.out.println("Dont right");
//        }


        /**
         * Напишите программу на Java, которая считывает
         * два числа с плавающей запятой и проверяет,
         * совпадают ли они с точностью до трех десятичных
         * знаков.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число а: ");
//        double a = sc.nextDouble();
//        System.out.print("Введите число б ");
//        double b = sc.nextDouble();
//        if (a > b || a < b) {
//            System.out.println("Числа разные");
//        } else {
//            System.out.println("Числа похожие");
//        }

        /**
         * Узнать количество дней в месяце
         *
         * Тестовые данные
         * Введите номер месяца: 2
         * Введите год: 2016
         * Ожидаемый результат :
         * В феврале 2016 года 29 дней
         *
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите номер месяца : ");
//        int month = sc.nextInt();
//        System.out.print("Введите год : ");
//        int year = sc.nextInt();
//
//       switch (month) {
//           case - 1 :
//               System.out.println("January = 31 days");
//               break;
//           case - 2 :
//               if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
//                   System.out.println("February = 29 days");
//               }else {
//                   System.out.println("February = 28 days");
//               }
//               break;
//           case - 3 :
//               System.out.println("March = 30 days");
//               break;
//           case - 4 :
//               System.out.println("April = 31 days");
//               break;
//           case - 5 :
//               System.out.println("May = 30 days");
//               break;
//           case - 6 :
//               System.out.println("June = 31 days");
//               break;
//           case - 7 :
//               System.out.println("July = 30 days");
//               break;
//           case - 8 :
//               System.out.println("August = 31 days");
//               break;
//           case - 9 :
//               System.out.println("September = 30 days");
//               break;
//           case - 10 :
//               System.out.println("October = 31 days");
//               break;
//           case - 11 :
//               System.out.println("November = 30 days");
//               break;
//           case - 12 :
//               System.out.println("December = 31 days");
//               break;
//       }
//
//        System.out.println(year);
//


    }
}
