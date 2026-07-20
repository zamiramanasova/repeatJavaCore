package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class CO1_Logic {
    public static void main(String[] args) {

        // Конъюкция И - & - AND
        // Если хоть один из операндов имеет значение 0 - все имеет значение ноль.
        // Иначе  - 1.
        // 0 & 0 = 0  1 & 0 = 0
        // 0 & 1 = 1  1 & 1 = 1

        byte operand1, operand2;
        int result;
        operand1 = 127;
        operand2 = 1;
        result = operand1 & operand2;
        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // Дизъюнкция ИЛИ - OR - |
        // Если хоть одно значение имеет 1 - вся конструкция имеет значение 1. Иначе 0.
        byte operand3 = 2;
        byte operand4 = 1;
        int result2 = operand3 | operand4;
        System.out.println(result2);

        // Исключающее ИЛИ
        // Таблица истинности для исключающего ИЛИ - ^ - XOR
        // Если операнды имеюют одинаковое значение - результат операции 0.
        // Если операнды разные - 1.
        byte operand5 = 3;
        byte operand6 = 1;
        int result3 = operand3 | operand4;
        System.out.println(result3);

        // Отрицание
        // Таблица истинности для отрицания НЕТ - ~ - NOT
        byte operand7 = 1;
        int result4 = ~operand7;
        System.out.println(result4);
    }
}
