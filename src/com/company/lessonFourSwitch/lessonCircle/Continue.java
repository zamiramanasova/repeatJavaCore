package com.company.lessonFourSwitch.lessonCircle;

public class Continue {
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter: " + counter);

            if (true) continue; // с пропуском итерации continue

            System.out.println("Это строка не выполнится");
        }
        System.out.println("Произведено " + counter + " итераций.");
    }
}
