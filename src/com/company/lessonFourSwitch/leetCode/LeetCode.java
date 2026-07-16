package com.company.lessonFourSwitch.leetCode;

public class LeetCode {
    public static void main(String[] args) {
        mySqrt(4);
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {
        int num = 1;
        int rez = 0;
        while(x>0){
            x-=num;
            num+=2;
            rez+=(x<0)?0:1;
        }
        return rez;
    }
}
