package ru.te3ka.exercisesleetcode;

public class Main1672 {
    public static void main(String[] args) {
//        int[][] input = {
//                {1, 2, 3}, // 6
//                {3, 2, 1}  // 6
//        };

        int[][] input = {
                {2, 8, 7}, // 17
                {7, 1, 3}, // 11
                {1, 9, 10}, // 20
                {3, 2, 1}  // 6
        };

        Solution solution = new Solution();
        for (int[] ints : input) {
            System.out.print("[ ");
            for (int val : ints) {
                System.out.print(val + " ");
            }
            System.out.println("]");
        }

        System.out.println(solution.maximumWealth(input));
    }
}