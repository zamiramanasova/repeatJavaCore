package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class SwitchWeek {
    public static void main(String[] args) {

        int myDay;
        System.out.println("Введите число от 1 до 7: ");
        Scanner sc = new Scanner(System.in);
        myDay = sc.nextInt();

        switch (myDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("WRONG WRITE DAY");
        }
    }
}
