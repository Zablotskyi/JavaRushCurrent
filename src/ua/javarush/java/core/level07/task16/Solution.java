package ua.javarush.java.core.level07.task16;

public class Solution {
    public static void main(String[] args) {
        // Створюємо зубчастий масив із заданою кількістю елементів у кожному рядку
        int[][] zoneTemperatures = new int[3][];
        // Зона A: три датчики
        zoneTemperatures[0] = new int[]{18, 16, 13};
        // Зона B: два датчики
        zoneTemperatures[1] = new int[]{20, 19,};
        // Зона C: чотири датчики
        zoneTemperatures[2] = new int[]{22, 23, 26, 25};
        // Ініціалізуємо змінну для збереження максимального значення
        int maxTemp = Integer.MIN_VALUE;

        // Проходимо по всіх елементах зубчастого масиву
        for (int[] row : zoneTemperatures) {
            for (int item : row) {
                if (maxTemp < item) {
                    // Оновлюємо максимальне значення, якщо поточна температура більша
                    maxTemp = item;
                }
            }
        }
        // Виводимо максимальне значення температури на екран
        System.out.println(maxTemp);
    }
}