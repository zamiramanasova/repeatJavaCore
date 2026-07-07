package com.company.lessonFourSwitch.lessonFiveMethods;

public class MethodRecursionSecond {

    static void recursion(int counter) {
        counter--;

        System.out.println("Первая половина метода recursion: " + counter);

        if (counter != 0) {
            method(counter);
        }

        System.out.println("Вторая половина метода recursion: " + counter);
    }

    static void method(int counter) {
        System.out.println("Первая половина метода method: " + counter);

        recursion(counter);

        System.out.println("Вторая половина метода method: " + counter);
    }
}
