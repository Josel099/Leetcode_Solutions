package com.random.practice;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= s.length() - 1; i++) {

            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {

                switch (s.charAt(i)) {
                case ')' -> {

                    if (stack.contains('(') && '(' == stack.peek()){
                        stack.pop();
                    }else return false;

                }
                case '}' -> {
                    if (stack.contains('{') &&'{' == stack.peek()){
                        stack.pop();
                    }else return false;

                }
                case ']' -> {
                    if (stack.contains('[') &&'[' == stack.peek()){
                        stack.pop();
                    }else return false;
                }
                default -> {
                    return false;
                }
                }
            } else{
                stack.push(s.charAt(i));

            }
        }

        return stack.isEmpty();
    }

}
