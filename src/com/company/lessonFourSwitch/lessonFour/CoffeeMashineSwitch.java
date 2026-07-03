package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class CoffeeMashineSwitch {

    public static void main(String[] args) {

        System.out.println("Размер стаканчиков кофе: 1 = маленький, 2 = средний, 3 = большой");
        System.out.println("Пожалуйста сделайте свой выбор");

        Scanner in = new Scanner(System.in);
        String coffeeSize = in.next();
        int cost = 0;

        switch (coffeeSize) {
            case "3":
                cost += 50;
            case "2":
                cost += 25;
            case "1":
                cost += 25;
                break;

            default:
                System.out.println("Неверный выборю Пожалуйста выберите 1, 2 или 3");
                break;
        }

        if (cost != 0) {
            System.out.println("Внесите " + cost + " копеек ");
            System.out.println("Спасибо");
        } else {
            System.out.println("Пожалуйста повторите выбор");
        }
    }
}
