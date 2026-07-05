package com.company.lessonFourSwitch.lessonCircle;

import java.util.Scanner;

public class GuessColor {
    // небольшая игра
    public static void main(String[] args) {
        System.out.println("Угадайте задуманный цвет с пяти попыток");
        System.out.println("Для выхода из программы введите - exit");

        final int MAX_ATTEMPT = 5;
        int attempt = 0;
        String color = "red";
        Scanner sc = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка "+ attempt + ":");
            String value = sc.nextLine();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equals(color)) {
                continue;
            }
            System.out.println("Поздравляем, вы угадали с "+ attempt + " попытки!");
            break;
        }
        System.out.println("Конец игры");

    }
}
