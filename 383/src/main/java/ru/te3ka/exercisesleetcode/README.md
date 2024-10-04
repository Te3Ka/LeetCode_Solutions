# 383. Записка с требованием выкупа
Учитывая две строки **ransomNote** и **magazine**,
верните **true**, если **ransomNote**
может быть создан с использованием букв из **magazine**,
и **false** в противном случае.

Каждая буква в **magazine**
может быть использована в **ransomNote** только один раз.

## Пример 1:

    Ввод: ransomNote = "a", magazine = "b"
    Вывод: false

## Пример 2:

    Ввод: ransomNote = "aa", magazine = "ab"
    Вывод: false

## Пример 3:

    Ввод: ransomNote = "aa", magazine = "aab"
    Вывод: true