package ru.te3ka.exercisesleetcode;

public class Solution {
    public boolean isValid(String s) {
        char[] arrParentheses = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                arrParentheses[++top] = ch;
            }
            else {
                if (top == -1)
                    return false;
                char last = arrParentheses[top--];
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
