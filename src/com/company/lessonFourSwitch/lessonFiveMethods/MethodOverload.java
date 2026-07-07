package com.company.lessonFourSwitch.lessonFiveMethods;

public class MethodOverload {

    static void function() {
        System.out.println("Hello!");
    }

    static void function(String a) {
        System.out.println(a);
    }

    static void function(int i) {
        System.out.println(i);
    }

    static void function(double d) {
        System.out.println(d);
    }

    static void function(String s, int i) {
        System.out.println(s + i);
    }

    static void function(int r, String x) {
        System.out.println(r + x);
    }

    static String function(String k, String z) {
        return k;
    }

    public static void main(String[] args) {
        function();
        function("A");
        function(1);
        function(3.14);
        function("B ", 2);
        function(3, " C");

        System.out.println(function("Hello", "World"));
    }
}
