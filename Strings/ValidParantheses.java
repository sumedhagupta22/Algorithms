package com.sgupta50.strings;

import java.util.Stack;

public class ValidParantheses
{
    public static void main(String args[]){
        ValidParantheses v = new ValidParantheses();
        String str= "()[]{}]";
        System.out.println(v.isValid(str));

    }
    public boolean isValid(String s) {
        if(s.length() %2 !=0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else if(c == '{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
