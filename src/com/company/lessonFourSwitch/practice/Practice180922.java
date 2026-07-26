package com.company.lessonFourSwitch.practice;


import java.util.Scanner;

/**
 * 31. Напишите программу, которая принимает три числа от пользователя и
 * печатает «увеличивающиеся», если числа расположены в порядке возрастания,
 * «убывающие», если числа находятся в порядке убывания, и «Ни возрастающий,
 * ни убывающий порядок» в противном случае.
 */
public class Practice180922 {
    public static void main(String[] args) {
        System.out.println(" Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Проверяем, расположены ли числа в порядке возрастания
        if (a < b && b < c) {
            System.out.println("увеличивающиеся");
        }
        // Проверяем, расположены ли числа в порядке убывания
        else if (a > b && b > c) {
            System.out.println("убывающие");
        }
        // Во всех остальных случаях порядок ни возрастающий, ни убывающий
        else {
            System.out.println("Ни возрастающий, ни убывающий порядок");
        }
        sc.close(); // Закрываем Scanner (хороший тон)
    }
}
