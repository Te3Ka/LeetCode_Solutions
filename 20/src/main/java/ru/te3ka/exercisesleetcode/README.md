# 20. Valid Parentheses
    20. Допустимые скобки

Given a string **s** containing just the characters
'*(*', '*)*', '*{*', '*}*', '*\[*' and '*\]*'
determine if the input string is valid.

Дана строка **s** содержащая только символы
'*(*', '*)*', '*{*', '*}*', '*\[*' и '*\]*'.
Определите, является ли входная строка допустимой.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Входная строка допустима, если:
1. Открытые скобки должны быть закрыты тем же типом скобок.
2. Открытые скобки должны быть закрыты в правильном порядке.
3. Каждой закрывающей скобке должна соответствовать открывающая скобка того же типа.

### Example 1:
```
Input: s = "()"
Output: true
```
### Example 2:
```
Input: s = "()[]{}"
Output: true
```
### Example 3:
```
Input: s = "(]"
Output: false
```
### Example 4:
```
Input: s = "([])"
Output: true
```