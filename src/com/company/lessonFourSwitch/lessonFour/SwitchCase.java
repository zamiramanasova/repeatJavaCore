package com.company.lessonFourSwitch.lessonFour;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        String number = in.next();


        switch (number) {
            case "1": {
                System.out.println("1");
                break;
            }
            case "2": {
                System.out.println("2");
                break;
            }
            default: {
                System.out.println("Dont correct");
                break;
            }
        }
    }
}
