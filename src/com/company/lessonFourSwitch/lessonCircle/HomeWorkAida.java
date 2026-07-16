package com.company.lessonFourSwitch.lessonCircle;

import java.util.Scanner;

public class HomeWorkAida {
    public static void main(String[] args) {
        // 1 FOR
        /**
         числа от 1 до 100, которые делятся на 3 и на 5 без остатка &&  %
         1ден 100гө чейинки сандардан -  3 жана 5ке бөлүнүүчү сандарды консольго чыгарасыз.

         15 30 45 60 75 90
         //         */
//        for (int number = 1; number < 100; number += 15) {
//            if ()
//            System.out.println(number);
//        }

/**
 получаем число через консоль от 1 до 10
 выводим те цифры от 1 до 100 которые делятся на это число без остатка
 */
//       System.out.println("Введите число от 1 до 10: ");
//       Scanner ac = new Scanner(System.in);
//       int b = ac.nextInt();
//       for (int a = 1; a < 100; a++) {
//           if (a % b == 0) {
//               System.out.println(a);
//           }
//       }


/**
 * сколько чисел можно исключить в отрезке 1 -1000, которые делятся
 * на 13 без остатка.
 *
 * Ответ = ???
 * */
//        int count = 0;
//        for (int h = 1; h < 1000; h++) {
//            if (h % 13 == 0) {
//                count++;
//            }
//        }
//        System.out.println("Числа которые делятся на 13: " + count);


/**
 * int sum = 0;
 * int san
 * получаем число, если введенное число положительное-
 * то добавляем к сумме это число.
 * если отрицательное или 0 - то завершаем программу.
 *
 * */

//        System.out.println("Введите любое число: ");
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        while (true) {
//            int q = sc.nextInt();
//            if (q > 0) {
//                sum = q + sum;
//                System.out.println(sum);
//            } else {
//                break;
//            }
//        }
//        System.out.println(sum);

/**
 * получить число из консоли san = 2  и вывести таблицу умножения
 *
 * консолдон санды san = 2 алуу жана көбөйтүү таблицасынан чыгаруу
 *
 * 2*1=2
 * 2*2=4
 * 2*3=6
 * 2*4=8
 * 2*5=10
 * 2*6=12
 * 2*7=14
 * 2*8=16
 * 2*9=18
 * 2*10=20
 * */
//
//        System.out.println("Введите число 2");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println(a + " * " + i + " = " + a * i);
//        }

/**
 *
 * Необходимо,
 * чтоб программа выводила на экран вот такую последовательность:
 *
 * ушундай последовательность чыгыш керек
 *
 * 1.0 4.0 9.0 16.0 25.0 36.0 49.0 64.0 81.0 100.0
 *
 * */
//
//        double d = 0;
//
//        for (int f = 0; f <= 100; f += 2) {
//            d = f + d;
//            d++;
//            System.out.println(d);
//
//            if (d == 100) {
//                break;
//            }
//        }

//        for (int f = 1; f <= 10; f++) {
//            System.out.println(Math.pow(f, 2));
//        }
    }
}