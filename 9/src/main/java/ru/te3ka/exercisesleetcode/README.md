# 9. Palindrome Number
    9. Числовой палиндром

Given an integer **x**,
return **true** if **x** *is a palindrome*,
and _**false** otherwise_

Дано целое число **x**,
вернуть **true** если **x** *является палиндромом*,
и _**false** в противном случае_

### Example 1:
    Пример 1:
```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
______________
Ввод: x = 121
Вывод: true
Объяснение: 121 читается как 121 как слева направо, так и справа налево.
```
### Example 2:
    Пример 2:
```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
______________
Ввод: x = -121
Вывод: false
Объяснение: Слева направо это читается как -121. Однако справа налево это читается как 121-. Следовательно это не палиндром.
```
### Example 3:
    Пример 3:
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
______________
Ввод: x = 10
Вывод: false
Объяснение: Читается 01 справа налево. Следовательно, это не палиндром.
```
### Constraints:
    Органичения
```
-2^31 <= x <= x^31 - 1
```
### Follow up:
    Дополнительные действия:
Could you solve it without converting the integer to a string?

Сможете ли вы решить это без ковертации целого числа в строку?