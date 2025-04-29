package ru.te3ka.exercisesleetcode;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        if (x % 10 == 0)
            return false;

        int temp = x;
        int retX = 0;
        while (temp > 0) {
            retX += temp % 10;
            if (temp >= 10)
                retX *= 10;
            temp /= 10;
        }
        return retX == x;
    }
}
