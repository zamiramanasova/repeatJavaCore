package com.company.lessonFourSwitch.lessonCircle;

public class CycleForContinue {
    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) continue;

            System.out.println("Это строка не выполнится");
        }
    }
}
