# 1480. Текущая сумма одномерного массива
Задан массив nums.

Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).

Возвращает текущую сумму nums.

## Пример 1:
Входные данные: nums = [1,2,3,4]

Вывод: [1,3,6,10]

Объяснение: Текущая сумма получается следующим образом: [1, 1+2, 1+2+3, 1+2+3+4].
## Пример 2:
Входные данные: nums = [1,1,1,1,1]

Вывод: [1,2,3,4,5]

Объяснение: Текущая сумма получается следующим образом: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
## Пример 3:
Входные данные: nums = [3,1,2,10,1]

Вывод: [3,4,6,16,17]
## Ограничения:
1 <= nums.length <= 1000

-10^6 <= nums[i] <= 10^6