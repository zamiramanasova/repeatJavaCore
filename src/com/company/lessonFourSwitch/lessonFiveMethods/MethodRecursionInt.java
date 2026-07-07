package com.company.lessonFourSwitch.lessonFiveMethods;

public class MethodRecursionInt {

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("Нахождение наибольшего общего делителя двух целых чисел");

        int a = 676, b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", HOD = " + calculate(a, b) + ";");
        //System.out.println("a = " + a + ", b = " + b + ", HOD = " + calculate2(a, b) + ";");
    }

    // second variant
    static int calculate2(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a;

    }
}
