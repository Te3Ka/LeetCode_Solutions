# 21. Merge Two Sorted Lists
*21. Соединение двух сортированных списков*

You are given the heads of two sorted linked lists **list1** and **list2**.

Вам даны заголовки двух сортированных связанных списков **list1** и **list2**.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Соедините эти два списка в один отсортированный список. Список должен быть соединён вместе нодами из первых двух списков.

Return the head of the merged linked list.

Верните заголовок объединённого связанного списка.

## Examples
*Примеры*

### Example 1
*Пример 1*
![img.png](img.png)
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```
### Example 2:
*Пример 2*
```
Input: list1 = [], list2 = []
Output: []
```
### Example 3:
*Пример 3*
```
Input: list1 = [], list2 = [0]
Output: [0]
```

## Constraints:
*Ограничения*
* The number of nodes in both lists is in the range [0, 50].
  * *Количество нод в листах находиться в диапазоне [0, 50].*
* -100 <= Node.val <= 100
* Both **list1** and **list2** are sorted in non-decreasing order.
  * Как **list1**, так и **list2** отсортированы в неубывающем порядке.
