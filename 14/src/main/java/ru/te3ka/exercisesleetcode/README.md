# 14. Longest Common Prefix
Саиый длинный общий префикс.

Write a function to find the longest common prefix string amongst an array of strings.

Напишите функцию для поиска наибольшего общего префикса между строками в массиве.

If there is no common prefix, return an empty string **""**.

Если нет общего префикса, то вернуть пустую строку **""**.

### Example 1:
    Пример 1:
```
Input: strs = ["flower","flow","flight"]
Output: "fl"
__________
Ввод: strs = ["flower","flow","flight"]
Вывод: "fl"
```
### Example 2:
    Пример 2:
```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
__________
Ввод: strs = ["dog","racecar","car"]
Вывод: ""
Объяснение: Здесь нет общего префикса между введёнными строками.
```

### Constraints:
    Ограничения:
```
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
strs[i] содержит только строчные английские буквы, если оно не пустое. 
```