package ru.te3ka.exercisesleetcode;

import java.util.Map;

public class Solution {
    /**
     * Решение с заменой элементов.
     *
     * @param s - римское число, что есть строка из символов I, V, X, L, C, D, M
     * @return - целое число в индо-арабском представлении.
     */
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

    /**
     * Решение через Map
     *
     * @param s - римское число, что есть строка из символов I, V, X, L, C, D, M
     * @return - целое число в индо-арабском представлении.
     */
    public int romanToIntMap(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                res -= current;
            } else {
                res += current;
            }
        }
        return res;
    }
}
