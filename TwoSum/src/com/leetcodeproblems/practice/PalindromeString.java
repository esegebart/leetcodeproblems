package com.leetcodeproblems.practice;

public class PalindromeString {

    /**
     * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
     * <p>
     * Example 1:
     * Input: "aba"
     * Output: True
     * Example 2:
     * Input: "abca"
     * Output: True
     * Explanation: You could delete the character 'c'.
     * Note:
     * The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
     * our constraint 1 >= 50000
     */


    public static void main(String args[]) {
        //pseudo code
        // declare string S
        // 1 >= 500000
        // method boolean
        // s.length()
        // left , right
        //  s.char(left) == s.char(right)
        //left ++
        // right --
        // while left < right check [

        String s = "hhhhhhhhh"; // to hold my string

        System.out.println(checkString(s));


    }

    static boolean checker(String a, int left, int right) {
        while (left < right) {

            if (a.charAt(left) == a.charAt(right)) {
                left++;
                right--;
            }

            return false;
        }

        return true;
    }

    static boolean checkString(String a) {

        int left = 0;
        int right = a.length() - 1;


        while (left < right) {

            if (a.charAt(left) == a.charAt(right)) {
                left++;
                right--;

            } else {
                return checker(a, left + 1, right) || checker(a, left, right - 1);
            }
        }
        return true;
    }


}