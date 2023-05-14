package com.skywood.skywoodexamples.strings;

public class Palindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal Panama";

        System.out.println("Palindrome : " + checkPlaindrome(str));
    }

    private static boolean checkPlaindrome(String s) {

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetter(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetter(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
