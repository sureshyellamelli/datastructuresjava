package com.skywood.skywoodexamples.strings;

public class MinDistanceBtwnTwoString {

    public static void main(String[] args) {
        String[] str
                = {"the", "quick", "brown", "fox", "quick"};

        String word1 = "the", word2 = "quick";

        int d1= -1, d2= -1;
        int result = 0;

        for(int i=0 ; i< str.length; i++){
            if(str[i].equalsIgnoreCase(word1))
                d1 =i;
            if(str[i].equalsIgnoreCase(word2))
                d2 =i;
            if(d1 != -1 && d2 != -1)
                break;
        }
        result = d2-d1;

        System.out.print("Result : "+result);

    }
}
