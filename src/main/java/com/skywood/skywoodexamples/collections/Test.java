package com.skywood.skywoodexamples.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {


    }

    public static void passwordCheck(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;

            if(Character.isSpaceChar(i))
                if (set.contains(i))
                    specialChar = true;
        }

        // Strength of password
        System.out.print("Strength of password:- ");
        if (hasDigit && hasLower && hasUpper && specialChar
                && (n >= 10))
            System.out.print("strong");
        else if ((hasLower || hasUpper || hasDigit)
                && (n >= 8 && n<=10))
            System.out.print("medium");
        else
            System.out.print("weak");
    }
}
