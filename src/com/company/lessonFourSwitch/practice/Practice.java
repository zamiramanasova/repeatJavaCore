package com.company.lessonFourSwitch.practice;

import java.util.Scanner;

public class Practice {

    /**
     * задача при вводе на консоль любое колличество чисел
     * программа должна складывать их на одной строке друг с другом
     * 1234   = 1+2+3+4 = 10;
     * @param args
     */
    public static void main(String[] args) {

//        System.out.println("Введите число: ");
//        Scanner sc = new Scanner(System.in);
//        String[] c = sc.nextLine().split(" ");
//        int a = Integer.parseInt(c[0]);
//        int b = Integer.parseInt(c[1]);
//        System.out.println(a + b);
//        }

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int newNumber = Math.abs(a);
        while (newNumber > 0) {
            int b = newNumber % 10;
            sum += b;
            newNumber /= 10;
        }
        System.out.println(sum);
        System.out.println(newNumber);
    }

}