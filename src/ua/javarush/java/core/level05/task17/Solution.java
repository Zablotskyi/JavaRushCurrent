package ua.javarush.java.core.level05.task17;

public class Solution {
    public static void main(String[] args) {
        // Перебираємо числа від 1 до 20
        for (int i = 1; i <= 20; i++) {
            // Якщо число ділиться на 3 без остачі, пропускаємо його
            if (i % 3 == 0) {
                continue;
            }
            // Виводимо число, не переходячи на новий рядок
            System.out.print(i + " ");
        }
    }
}