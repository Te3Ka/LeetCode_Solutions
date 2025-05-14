package ru.te3ka.exercisesleetcode;

public class Main20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s = "()[]{}";
        String s = "()([]{})";

        System.out.println(s);
        System.out.println(solution.isValid(s));
    }
}