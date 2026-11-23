package ua.javarush.java.core.level07.task15;

public class Solution {
    public static void main(String[] args) {
        // Створюємо зубчастий масив із заданими значеннями
        int[][] miniGameScores = new int[3][];
        // Перший рядок масиву
        miniGameScores[0] = new int[]{1, 2};
        // Другий рядок масиву
        miniGameScores[1] = new int[]{3, 4, 5};
        // Третій рядок масиву
        miniGameScores[2] = new int[]{6};

        // Змінна для зберігання суми всіх елементів масиву
        int sum = 0;

        // Проходимо кожним рядком масиву
        for (int[] row : miniGameScores) {
            // Проходимо кожним елементом рядка
            for (int item : row) {
                // Додаємо значення елемента до загальної суми
                sum += item;
            }
        }
        // Виводимо підсумкову суму на екран
        System.out.println(sum);
    }
}