package com.company.lessonFourSwitch.array;

public class Array2 {
    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int anArray : array) {
            System.out.print(anArray + "  ");
        }
    }
}
