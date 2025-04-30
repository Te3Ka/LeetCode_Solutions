# 13. Roman to Integer
    13. Римские числа в целые числа (т.е. индо-арабские)

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Римские числа представлены семью разными символами: I, V, X, L, C, D и M.

    Symbol/Символ       Value/Значение
    I                   1
    V                   5
    X                   10
    L                   50
    C                   100
    D                   500
    M                   1000

For example, **2** is written as **II** in Roman numeral,
just two ones added together.
**12** is written as **XII**, which is simply **X + II**.
The number **27** is written as **XXVII**,
which is **XX + V + II**.

Например, **2** записывается как **II** в римских числах,
просто две единицы сложенные вместе.
**12** записывается как **XII**, то есть просто **X + II**.
Число **27** записывается как **XXVII**,
то есть как **XX + V + II**.

Roman numerals are usually written largest
to smallest from left to right.
However, the numeral for four is not **IIII**.
Instead, the number four is written as **IV**.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine,
which is written as **IX**.
There are six instances where subtraction is used:
* **I** can be placed before **V** (5) and **X** (10)
to make 4 and 9.
* **X** can be placed before **L** (50) and **C** (100)
to make 40 and 90.
* **C** can be placed before **D** (500) and **M** (1000)
to make 400 and 900.

Римские числа записывается от большего к меньшему слева направо.
Однако, число обозначающее четыре это не **IIII**.
Вместо этого, число четыре записывается как **IV**.
Поскольку единица стоит перед пятёркой, мы вычитаем её и получаем четыре.
Похожий принцип применяется для числа девять,
которое записывается как **IX**
Существует шесть случаев, когда используется вычитание:
* **I** может быть до **V** (5) и **X** (10)
делая 4 и 9.
* **X** может быть до **L** (50) и **C** (100)
делая 40 и 90
* **C** может быть до **D** (500) и **M** (1000)
делая 400 и 900

Given a roman numeral, convert it to an integer.

Получив на римское число преобразуйте его в целое (индо-арабское) число.

### Example 1:
    Пример 1:
```
Input: s = "III"
Output: 3
Explanation: III = 3.
__________
Ввод: s = "III"
Вывод: 3
Объяснение: III = 3
```
### Example 2:
    Пример 2:
```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
__________
ВВод: s = "LVIII"
Вывод: 58
Объяснение: L = 50, V = 5, III = 3 
```

### Example 3:
    Пример 3:
```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
__________
Ввод: s = "MCMXCIV"
Вывод: 1994
Объяснение: M = 1000, CM = 900, XC = 90, IV = 4
```
### Constraints:
    Ограничения:
```
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
_________
s содержит только символы ('I', 'V', 'X', 'L', 'C', 'D', 'M').
Это гарантирует что все действительные римские числа будут в диапазоне [1, 3999].
```