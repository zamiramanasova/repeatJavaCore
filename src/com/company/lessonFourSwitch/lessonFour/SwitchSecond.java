package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class SwitchSecond {
    public static void main(String[] args) {
        System.out.println("Введите номер недели: 1-2-3-4-5-6-7");
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("День недели рабочий");
                break;
            case "6":
            case "7":
                System.out.println("Выходные дни");
                break;
            default:
                System.out.println("Вы ввели недействующий день");
        }
    }
}
