package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class C04_Logic {
    public static void main(String[] args) {

        boolean operand1 = false, operand2 = false, result = false;

        // Таблица истинности для Конъюкции И && AND
        //если хоть одно выражение имеет значение false
        // все выражение имеет значение false иначе true
        // false & false = false
        // false & true = false
        // true && false = false
        // true && true = true

        operand1 = true;
        operand2 = false;
        System.out.println(operand1 + "AND " + operand2 + "=" + result);

        //Логические операции

        //Чтобы проверить условие А < X < B , нельзя записать его в условном операторе непосредственно
        // так как каждая операция отношения должна иметь два операнда
        // правильный способ записи: If (A < x && x < B)

        int a = 0, b = 5, x =3;

        if (a < x && x < b) { // && = И
            System.out.println("Число: " + x + " находится в диапазоне чисел от "+ a + " до " + b);
        } else {
            System.out.println("Число: " + x + " не попадает в диапазоне чисел от "+ a + " до " + b);
        }

        // можно это же решение решить анологичным способом
        if (a < x) {
            if (x < b) {
                System.out.println("Число: " + x + " находится в диапазоне чисел от "+ a + " до " + b);
            } else {
                System.out.println("Число: " + x + " не попадает в диапазоне чисел от "+ a + " до " + b);
            }
        }

        //вывести самое меньшее а
        if (a < b && a < x) {
            System.out.println(a);
        } else if (b < a && b < x) {
            System.out.println(b);
        } else {
            System.out.println(x);
        }


    }
}
