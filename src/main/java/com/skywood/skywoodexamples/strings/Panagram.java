package com.skywood.skywoodexamples.strings;

import java.util.Arrays;

public class Panagram {
    public static void main(String[] args) {


        String str1 = "The quick brown fox jumps over the lazy dog";

        int vector[] = new int[26];

        Arrays.fill(vector, 0);

        String str = str1.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {


        /*    if(! Character.isDigit(str.charAt(i))  ||
                    ! Character.isSpaceChar(str.charAt(i))) {

                if ('A' >= str.charAt(i) && str.charAt(i)  <= 'Z')   {

                    vector[str.charAt(i) - 'A']++;

                } else if ('a' >= str.charAt(i) && str.charAt(i) <= 'z') {*/
                    vector[str.charAt(i) - 'a']++;

                }

        for (int i : vector) {
            if (i == 0)
                System.out.print(" False");
            break;
        }

    }
}
