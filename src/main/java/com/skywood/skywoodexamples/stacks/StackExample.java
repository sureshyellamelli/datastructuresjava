package com.skywood.skywoodexamples.stacks;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {


        String str = "({[]})";

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(' || c == '{' || c== '['){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else
                continue;

        }

        System.out.println(stack.isEmpty());


    }
}
