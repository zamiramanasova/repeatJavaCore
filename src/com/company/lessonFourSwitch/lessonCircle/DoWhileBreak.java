package com.company.lessonFourSwitch.lessonCircle;

public class DoWhileBreak {
    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter: "+ counter);

            if (true) break;
            System.out.println("Это строка не выполнится");
        }
        while (counter < 3);

        System.out.println("Произведено " + counter + " итераций");
    }
}
