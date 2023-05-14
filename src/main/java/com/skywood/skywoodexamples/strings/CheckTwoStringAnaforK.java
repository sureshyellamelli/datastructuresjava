package com.skywood.skywoodexamples.strings;

import java.util.*;
import java.util.stream.Collectors;

public class CheckTwoStringAnaforK {

    public static void main(String[] args) {

        String str1 = "geeks";
        String str2 = "eggkf";
        int k = 1;
        System.out.print("Anagram : "+checkAnagram(str1,str2,k));


    }

    private static boolean checkAnagram(String s1, String s2, int k){

        boolean b = false;
        if(s1.length() != s2.length())
            return b;

        Map<Character, Integer> map = new HashMap<>();
        for(int index =0 ; index < s1.length(); index ++){
            Character c = s1.toCharArray()[index];
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        map.entrySet().forEach(System.out::println);
        for(int j =0 ; j<s2.length(); j++){
            Character c = s2.toCharArray()[j];
            if(map.containsKey(c))
                map.put(c, map.get(c)-1);
            else
                map.put(c, 1);
        }

        int count = 0;
        for (char ch : map.keySet()) {
            count += map.get(ch);
        }

        return  count > k ? false :true ;
    }
}
