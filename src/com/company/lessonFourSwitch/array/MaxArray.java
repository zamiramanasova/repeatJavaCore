package com.company.lessonFourSwitch.array;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) - 5);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int tempMax = arr[0];
        int tempMin = arr[0];
        int valueMax = 0;
        int valueMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tempMin) {
                tempMin = arr[i];
                valueMin = i;
            }
            if (arr[i] > tempMax) {
                tempMax = arr[i];
                valueMax = i;
            }
        }
        System.out.println("\nMin index = " + valueMin + "\nMaxIndex = "+ valueMax);
        for (int i = 0; i < arr.length; i++) {
            if (i == valueMin) arr[i] = tempMax;
            else if (i == valueMax) arr[i] = tempMin;
        }
        System.out.println("MaxValue = " + tempMax);
        System.out.println("MinValue = " + tempMin);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}
