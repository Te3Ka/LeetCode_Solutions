package ru.te3ka.exercisesleetcode;

public class Main383 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("a", "a"));
        System.out.println(solution.canConstruct("aa", "ab"));
        System.out.println(solution.canConstruct("aa", "aab"));
        System.out.println(solution.canConstruct("inez", "magazine"));
        System.out.println(solution.canConstruct("gaz", "magazine"));
        System.out.println(solution.canConstruct("zagai", "magazine"));
        System.out.println(solution.canConstruct("zaagai", "magazine"));
    }
}