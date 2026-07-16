package com.company.lessonFourSwitch.leetCode;

/***
 * Программа по выводу палиндрома с помощью String.
 */
public class PalindromeString {
    public static void main(String[] args) {
        String s = "ABCBA";

        System.out.println(isPalindrome(s) ? "YES" : "NO");
    }

    private static boolean isPalindrome(String s) {
        // base step
        if(s.length() == 1 || s.length() == 0)
            return true; //тогда палиндром

        //если s чарет ноль равняется  s.charAt(s.length() - 1) с последним, то
        // то тогда мы продолжаем вызывать палиндром
        if(s.charAt(0) == s.charAt(s.length() - 1))
            //при возвр true, то я беру стринг и обрезаю с обеих сторон похожие
            return isPalindrome(s.substring(1, s.length() - 1));// шаг рекурсия
        // это относится ко второму if else
        return false;
    }
}
