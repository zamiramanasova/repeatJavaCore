package com.company.lessonFourSwitch.lessonCircle;

import java.util.Scanner;

public class SpiderLoop {
    public static void main(String[] args) {
        char character = '\0';
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            character = sc.next().charAt(0);

            switch (character) {
                case 'l': {
                    System.out.println("Go left");
                    continue;
                }
                case 'r': {
                    System.out.println("Go right");
                    continue;
                }
            }

            switch (character) {
                case 'x': {
                    System.out.println("Exit");
                    continue;
                }
                case 'q': {
                    System.out.println("Quit");
                    continue;
                }
                default:
                {
                    System.out.println("Alternative exit");
                    break;
                }
            }
            break;
        }
    }
}
