package ru.te3ka.exercisesleetcode;

public class Solution {
    public int numberOfSteps(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append("Входное число: ").append(num).append("\n");
        int numberSteps = 0;
        while (num != 0) {
            numberSteps++;
            sb.append(numberSteps).append(") ");
            if (num % 2 == 0) {
                sb.append(num).append(" - чётное число. Делим на 2 и получаем ");
                num /= 2;
                sb.append(num).append("\n");
            }
            else {
                sb.append(num).append(" - нечётное число. Вычитаем 1 и получаем ");
                num--;
                sb.append(num).append("\n");
            }
        }
        sb.append("Всего потребовалось шагов: ").append(numberSteps).append("\n");
        System.out.println(sb);
        return numberSteps;
    }
}