package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class DeMorganTheoremes {
    public static void main(String[] args) {

        // Преобразование логических переменных в соответствии с теоремами Де Моргана
        // Для применения теорем Де Моргана к логическому оператору AND и OR и паре операндов,
        // инвертировать все выражение полностью

        // Исходное выражение                                  Эквивалентное выражение
        // !A & !B                                               !(A | B)
        // !A & B                                                !(A | !B)
        //  A & !B                                               !(!A | B)
        //  A & B                                                !(!A | !B)
        //  !A | !B                                              !(A & B)
        //  !A | B                                               !(A & !B)
        //  A | !B                                               !(!A & B)
        //  A | B                                                !(!A & !B)

        boolean a = true;
        boolean b = false;

        // условие до применения теоремы Де Моргана

        if (!a || !b) {
            System.out.println(!a || !b);
        } else {
            System.out.println(!a || !b);
        }

        //условие после применения теоремы Де Моргана
        if (!(a && b)) {
            System.out.println(a && b);
        } else {
            System.out.println(a && b);
        }
    }
}
