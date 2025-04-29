package ru.te3ka.exercisesleetcode;


public class Main9 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("x = " + 121 + " is palindrome? " + solution.isPalindrome(121));
        System.out.println("x = " + 1001 + " is palindrome? " + solution.isPalindrome(1001));
        System.out.println("x = " + -121 + " is palindrome? " + solution.isPalindrome(-121));
        System.out.println("x = " + -12321 + " is palindrome? " + solution.isPalindrome(-12321));
        System.out.println("x = " + 45654 + " is palindrome? " + solution.isPalindrome(45654));
        System.out.println("x = " + 456540 + " is palindrome? " + solution.isPalindrome(456540));
    }
}