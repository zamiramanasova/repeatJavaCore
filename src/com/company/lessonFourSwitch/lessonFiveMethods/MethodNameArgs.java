package com.company.lessonFourSwitch.lessonFiveMethods;

public class MethodNameArgs {

    static int difference(int height, int width) {
        return height - width;
    }

    public static void main(String[] args) {
        // можно вызвать метод так
        int difference;
        difference = difference(6,5);

        System.out.println("Разность равна: "+ difference);
    }
}
