package ru.te3ka.exercisesleetcode;

public class Solution {
    public int romanToInt(String s) {
        int res = 0;

        char[] romNumbers = s.toCharArray();
        for (int i = 0; i < romNumbers.length; i++) {
            if (i == romNumbers.length - 1) {
                if (romNumbers[i] == 'I')
                    res += 1;
                if (romNumbers[i] == 'V')
                    res += 5;
                if (romNumbers[i] == 'X')
                    res += 10;
                if (romNumbers[i] == 'L')
                    res += 50;
                if (romNumbers[i] == 'C')
                    res += 100;
                if (romNumbers[i] == 'D')
                    res += 500;
                if (romNumbers[i] == 'M')
                    res += 1000;
                break;
            } else {
                if (romNumbers[i] == 'C') {
                    if (romNumbers[i + 1] == 'D') {
                        res += 400;
                        i++;
                        continue;
                    }
                    if (romNumbers[i + 1] == 'M') {
                        res += 900;
                        i++;
                        continue;
                    }
                    res += 100;
                }
                if (romNumbers[i] == 'X') {
                    if (romNumbers[i + 1] == 'L') {
                        res += 40;
                        i++;
                        continue;
                    }
                    if (romNumbers[i + 1] == 'C') {
                        res += 90;
                        i++;
                        continue;
                    }
                    res += 10;
                }
                if (romNumbers[i] == 'I') {
                    if (romNumbers[i + 1] == 'V') {
                        res += 4;
                        i++;
                        continue;
                    }
                    if (romNumbers[i + 1] == 'X') {
                        res += 9;
                        i++;
                        continue;
                    }
                    res += 1;
                }
                if (romNumbers[i] == 'V')
                    res += 5;
                if (romNumbers[i] == 'L')
                    res += 50;
                if (romNumbers[i] == 'D')
                    res += 500;
                if (romNumbers[i] == 'M')
                    res += 1000;
            }
        }
        return res;
    }
}
