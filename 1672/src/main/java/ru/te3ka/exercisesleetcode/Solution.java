package ru.te3ka.exercisesleetcode;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] richesOnePerson = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                richesOnePerson[i] += accounts[i][j];
            }
        }
        int maxWealth = -1;
        for (int wealth : richesOnePerson) {
            if (maxWealth < wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}