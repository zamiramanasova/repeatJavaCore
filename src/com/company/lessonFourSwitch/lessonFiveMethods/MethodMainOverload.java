package com.company.lessonFourSwitch.lessonFiveMethods;

public class MethodMainOverload {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        }else {
            main();
        }
    }

    public static void main() {
        System.out.println("I t is usual method without String[] args!");
    }
}
