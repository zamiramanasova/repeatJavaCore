package com.company.lessonFourSwitch.leetCode;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 * Dont use String, char.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        int nr = x;

        while (nr > 0) {
            rev = 10 * rev + nr % 10;
            nr /= 10;
        }
        return rev == x;
    }
}
