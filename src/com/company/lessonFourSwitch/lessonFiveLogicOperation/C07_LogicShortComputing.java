package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class C07_LogicShortComputing {
    public static void main(String[] args) {
        // Короткозамкнутое вычисление - техника работающая по следующему принципу:
        //Если значение первого операнда в операции AND (&&) ложно, то второй операнд не вычисляется,
        //потому что полное выражение в любом случае будет ложным
        final int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // Условие которое работает с использованием техники КОРОТКОЗАМКНУТОГО ВЫЧИСЛЕНИЯ
        // Если бы это вычисление вычислялось полностью, то операция деления во втором операнде
        // генерировала бы ошибку деления на 0.

        if ((denominator != 0) & (item / denominator) > MIN_VALUE) {
            System.out.println("Мы в блоке if");
        } else {
            System.out.println("Мы в блоке Else");
        }
        // рекомендуется использовать два знака &&

    }
}
