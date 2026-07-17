package com.company.lessonFourSwitch.lessonCircle;

public class С01_WhileBreak {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            if (true) break; // если правда то мы выходим из цикла
            System.out.println("Это строка не выполнится");
        }
        System.out.println("Произведено " + counter + " итераций.");
    }
}
