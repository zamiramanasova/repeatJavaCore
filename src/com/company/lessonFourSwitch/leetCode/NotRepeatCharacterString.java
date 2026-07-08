package com.company.lessonFourSwitch.leetCode;

/**
 * Given a string s, find the first non-repeating character in it
 * and return its index. If it does not exist, return -1.
 */
public class NotRepeatCharacterString {
    public static void main(String[] args) {
        String s = "aac";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }
        return -1;
    }
}
