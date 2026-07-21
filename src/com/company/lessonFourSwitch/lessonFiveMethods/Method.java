package com.company.lessonFourSwitch.lessonFiveMethods;

public class Method {

    static byte addition(byte argument) {

        argument = (byte)(argument + 1);
       // argument++;    анологично
       // argument += 1; анологично
        return argument;
    }

    static void rect(int s) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static String function() {
        return "Hello";
    }

    static String function1() {
        String word = "Hello!";
        return word;
    }

    static int add(int a , int b) {
        return a + b;
    }

    static boolean and(boolean a, boolean b) {
        return a && b;  // логическое И по сути означает умножение
    }

     public static void main(String[] args) {
        // ВАРИАНТ НАПИСАНИЯ КОДА БЕЗ МЕТОДА
//        byte a = 1;
//        System.out.println(addition(a));
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        rect(5);
//
//        String string = function();
//        System.out.println(string);
//
//        System.out.println(function());


//         int a = 2, b =3;
//         int sum = add(a, b);
//         System.out.println(a + " + " + b + " = " + sum);


         boolean operand1 = true, operand2 = true;
         boolean result = and(operand1, operand2);
         System.out.println(operand1 + " + " + operand2 + " = " + result);
    }
}
