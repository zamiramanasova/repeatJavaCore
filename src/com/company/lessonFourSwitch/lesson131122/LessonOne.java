package com.company.lessonFourSwitch.lesson131122;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

/**
 * 28 example
 * Напишите программу на Java, которая читает число с плавающей запятой.
 * Если число равно нулю, оно печатает «ноль», в противном случае выведите
 * «положительный» или «отрицательный». Добавьте «маленький», если абсолютное значение
 * числа меньше 1, или «большой», если он превышает 1 000 000.
 */

/**
 * 29 example
 * Напишите программу на Java, которая читает положительное целое число
 * и подсчитывает количество цифр, которое имеет число (менее десяти миллиардов).
 */

/**
 * 30.
 * Напишите программу на Java, которая принимает три числа
 * и печатает «Все числа равны», если все три числа равны,
 * «Все числа различны», если все три числа различны, и
 * «Ни все не равны или различны» в противном случае.
 */
public class LessonOne {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double number = scanner.nextDouble();
//        if (number > 0) {
//            if (number < 1) {
//                System.out.println("Positive small");
//            } else if (number > 1000000) {
//                System.out.println("Positive large");
//            } else {
//                System.out.println("Positive");
//            }
//        } else if (number < 0) {
//            if (Math.abs(number) < 1) {
//                System.out.println("Negative small");
//            } else if (Math.abs(number) > 100000) {
//                System.out.println("Negative large");
//            } else {
//                System.out.println("Negative");
//            }
//        }
//        else {
//            System.out.println("Zero");
//        }

//        System.out.println("Enter you number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a < 100000) {
//            if (a < 100) {
//                if (a < 10) {
//                    System.out.println("Колличество цифр: " + 1);
//                } else {
//                    System.out.println("Колличество цифр: " + 2);
//                }
//            } else {
//                if (a < 1000) {
//                    System.out.println("Колличество цифр: " + 3);
//                } else {
//                    if (a < 10000) {
//                        System.out.println("Колличество цифр: " + 4);
//                    } else {
//                        System.out.println("Колличество цифр: " + 5);
//                    }
//                }
//            }
//        } else {
//            if (a < 10000000) {
//                if (a < 1000000) {
//                    System.out.println("Колличество цифр: " + 6);
//                } else {
//                    System.out.println("Колличество цифр: " + 7);
//                }
//            } else {
//                if (a < 100000000) {
//                    System.out.println("Колличество цифр: " + 8);
//                } else {
//                    if (a < 1000000000) {
//                        System.out.println("Колличество цифр: " + 9);
//                    } else {
//                        System.out.println("Колличество цифр: " + 10);
//                    }
//                }
//            }
//        }

        System.out.println("Enter only three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equals");
        } else if ((num1 == num2) || (num1 == num3) || (num2 == num3)){
            System.out.println("Not all numbers are equals and different between");
        } else {
            System.out.println("All numbers are different between");
        }
    }
}
