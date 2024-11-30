package com.muhammet.List.Stack;

import java.util.Objects;
import java.util.Stack;

public class SpecialStack<T> extends Stack<T> {
    public SpecialStack() {}

    public Stack<Character> convertStackFromString(String str) {
        Stack<Character> stack = new Stack<>();
        if(Objects.isNull(str)) throw new RuntimeException("stack is null");
        for(char c : str.toCharArray()) {
            stack.push(c);
        }
        return stack;
    }
}
