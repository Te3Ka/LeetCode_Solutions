# 1672. Богатство самого богатого клиента

Вам дана целочисленная сетка m x n счетов,
в которой счета[i][j] - это количество денег,
хранящихся у i-го клиента в j-м банке.
Верните богатство, которым обладает самый богатый клиент.

Богатство клиента - это количество денег на всех его банковских счетах.
Самый богатый клиент - это клиент, имеющий максимальное богатство.

## Пример 1:
    Ввод: счета = [[1,2,3],[3,2,1]]
    Вывод: 6
#### Пояснение:
У 1-го клиента богатство = 1 + 2 + 3 = 6.

У второго клиента богатство = 3 + 2 + 1 = 6.

Оба покупателя считаются самыми богатыми с богатством 6 у каждого, поэтому возвращаем 6.

## Пример 2:
    Ввод: счета = [[1,5],[7,3],[3,5]]
    Вывод: 10
#### Пояснения:
Богатство 1-го клиента = 6.

Богатство 2-го клиента = 10.

Богатство 3-го покупателя = 8.

2-й клиент - самый богатый, его богатство равно 10.

## Пример 3:
    Ввод: счета = [[2,8,7],[7,1,3],[1,9,5]]
    Вывод: 17