package com.company.lessonFourSwitch.lessonFour;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        double b = 0.0;
        int max;

        max = (int) ((a > b) ? a : b);
        // or
        max = (a > b) ? a : (int)b;
        System.out.println(max);


        //Определение квадранта в котором лежит заданная точка

        int x = 10, y = -5;
        String quadrant0, quadrant1, quadrant2;

        //варианты написания тернарных операторов

        quadrant0 = (x > 0) ? ((y > 0) ? "I quadrant" : "IV quadrant") : ((y > 0) ? "II quadrant" : "III quadrant");

        quadrant1 = x > 0 ? (y > 0 ? "I quadrant" : "IV quadrant") : (y > 0 ? "II quadrant" : "III quadrant");

        quadrant2 = x > 0 ? y > 0 ? "I quadrant" : "IV quadrant" : y > 0 ? "II quadrant" : "III quadrant";

        System.out.println(quadrant0);
        System.out.println(quadrant1);
        System.out.println(quadrant2);


        //задача сделать скидку клиенту
        double quantity = 10;
        double price = 100;
        double discount = 0.75;
        double cost;

        // Если - купили 10 единиц товара и больше. То - предоставить скидку в 25$, ИНАЧЕ - скидку не предоставлять.
        cost = quantity >=10 ? quantity * price * discount : quantity * price;

        System.out.println("Общая стоимость товара составляют: " + cost + "y.e");
    }
}
