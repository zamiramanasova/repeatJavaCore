package com.company.lessonFourSwitch.lessonFiveLogicOperation;

public class C06_LogicShift {
    public static void main(String[] args) {
        //ЛОГИЧЕСКИЙ СДВИГ - SHIFT

        byte operand = 0b0000001;
        System.out.println("Число до сдвига: " + operand);

        // Логический сдвиг числа влево
        operand = (byte)(operand << 2); // 0000 0100
        System.out.println("Число после сдвига влево: " + operand);

        // Логический сдвиг числа вправо
        operand = (byte)(operand >> 1); // 0000 0010
        System.out.println("Число после сдвига вправо: "+ operand);

        int number = -1 >>> 24;
        System.out.println(number);
    }
}
