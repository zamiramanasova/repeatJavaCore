package com.company.lessonFourSwitch.lessonCircle;

public class CycleFor {
    public static void main(String[] args) {

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter : " + counter);
        }

        // Или объявить две переменные и идти по циклу, пока они не будут равны друг другу:
        for(int i = 5, j = 11; i != j; i++, j--) {
            System.out.println("i: " + i + " j: " + j);
        }
    }
}
