package ru.te3ka.exercisesleetcode;

import java.util.ArrayList;
import java.util.List;

public class Main412 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> fizzBuzz3 = new ArrayList<>(solution.fizzBuzz(3));
        List<String> fizzBuzz5 = new ArrayList<>(solution.fizzBuzz(5));
        List<String> fizzBuzz15 = new ArrayList<>(solution.fizzBuzz(15));

        System.out.println(fizzBuzz3);
        System.out.println(fizzBuzz5);
        System.out.println(fizzBuzz15);
    }
}