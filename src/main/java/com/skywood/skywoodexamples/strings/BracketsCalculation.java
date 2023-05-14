package com.skywood.skywoodexamples.strings;

import java.util.HashMap;
import java.util.Map;

public class BracketsCalculation {

    public static void main(String[] args) {


        String str = "(())))(";

        System.out.print(calculateIndex(str));

    }

    private static int calculateIndex(String str) {
        Map<String, Integer> map = new HashMap<>();

        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (i != 0) {
                Integer integer = map.get("(");
                if (integer.intValue() == 0)
                    return i;
            }
            if (c[i] == '(') {
                if (map.containsKey("("))
                    map.put("(", map.get("(") + 1);
                else
                    map.put("(", 1);
            } else {
                if (c[i] == (')')) {
                    if (map.containsKey("("))
                        map.put("(", map.get("(") - 1);
                }
            }
        }
        return -1;
    }
}
