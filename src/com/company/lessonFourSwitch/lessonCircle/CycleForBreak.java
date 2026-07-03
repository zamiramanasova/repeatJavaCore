package com.company.lessonFourSwitch.lessonCircle;

public class CycleForBreak {
    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) break;

            System.out.println("Это строка не выполнится");
        }
    }
}
