package com.company.lessonFourSwitch.lessonFiveMethods;

public class ReturnMethod {

    static String function(String name) {

        if (name == "fool") {//сторожевой оператор
            return "Not right";
        }

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        String sentence = function("fool");

        System.out.println(sentence);
    }
}
