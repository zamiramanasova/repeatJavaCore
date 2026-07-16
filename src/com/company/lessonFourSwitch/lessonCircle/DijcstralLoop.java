package com.company.lessonFourSwitch.lessonCircle;

import java.util.Scanner;

public class DijcstralLoop {
    public static void main(String[] args) {
        // БЕСКОНЕЧНЫЙ ЦИКЛ С ПРЕРЫВАНИЕ ОПЕРАТОРА - BREAK
        int character;
        Scanner in = new Scanner(System.in);

        for  (; ; ) {
            character = in.next().charAt(0);

            switch (character) {
                case 'l':
                    System.out.println("Go left");
                    continue;
                case 'r':
                    System.out.println("Go right");
                    continue;
            }
            break; // прерывание цикла
        }
    }
}
