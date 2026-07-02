package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class C05_Logic {
    public static void main(String[] args) {

        //Логические операции
        //Чтобы проверить условие А < x < B, нельзя записать его в условном операторе непосредственно,
        //так как каждая операция отношения должна иметь два операнда
        //правильный способ записи: if (A < x && x < B)

        int a = 0, b = 5, x = 3;

        if (a < x && x < b) {
            System.out.println("Число: " + x + " находится в диапазоне чисел от "+ a + " до " + b);
        } else {
            System.out.println("Число: " + x + " не попадает в диапазоне чисел от "+ a + " до " + b);
        }
    }
}
