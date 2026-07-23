package com.company.lessonFourSwitch.lessonFour;

public class Main {

    public static void main(String[] args) {
        // переменные
        byte b = 2;
        System.out.println(b);
        // byte
        byte a = -128;
        byte c = +127;
        // short
        short d = -32768;
        short e = +32767;
        // int
        int q = -2147483648;
        int w = +2147483647;

        final double PI = 3.1415;
        System.out.println(PI);

        //неявное преобразование из byte в int
        byte qw = 10;
        int r = 0;
        r = qw;
        System.out.println(r);//10
        //неявное преобразование из int в float
        int m = 255;
        float g = 0f;
        g = m;
        System.out.println(g);//255.0

        //явное преобразование
        int x = 128;
        byte n = 0;
        n = (byte) x;
        System.out.println(n);//-128

        float p = 10.5f;
        int k = 0;
        k = (int) p;
        System.out.println(k);//10

        // final
        final int i = 127;
        byte l = 0;
        l = i;
        System.out.println(l);//127

        final float z = 255;
        byte o = 0;
        o = (byte) z;
        System.out.println(o);//-1

        final int s = 254;
        byte y = 0;
        y = (byte)s;
        System.out.println(y);//-2

        final float f = 128.5f;
        byte t = 0;
        t = (byte)f;
        System.out.println(t);//-128


//логика счета такова, например нужно преобразовать int 254 в byte
        //                                           /   \
        //                                         127   127
        //                                                /
        //                                            +1 /
        //                                     -128   +   126
        //                                       \          /
         //                                          -2
    }
}
