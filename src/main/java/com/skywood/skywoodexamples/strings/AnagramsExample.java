package com.skywood.skywoodexamples.strings;

public class AnagramsExample {


    public static void main(String[] args) {
        //String titles[] = {,"speed","spede","deul","cars"};

        System.out.println(isAnagramCounting("duel!", "letd!"));
    }


    public static boolean isAnagramCounting(String string1, String string2) {


        if (string1.length() != string2.length())
            return false;

        int vectorCount[] = new int[256];

        for(int i =0 ; i< string1.length() ; i++){

            vectorCount[string1.toCharArray()[i]]++;
            vectorCount[string2.toCharArray()[i]]--;

        }
        for (int j = 0; j < vectorCount.length; j++) {
            if (vectorCount[j] != 0) {
                return false;
            }
        }
        return true;
    }
}
