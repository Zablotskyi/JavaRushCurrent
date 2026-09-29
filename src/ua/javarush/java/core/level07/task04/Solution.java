package ua.javarush.java.core.level07.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив довжиною 10 елементів
        int[] roundScores = new int[10];

        // Заповнюємо масив числами від 1 до 10 за допомогою циклу
        for (int i = 0; i < 10; i++) {
            roundScores[i] = i + 1;
        }


        // Виводимо всі елементи масиву в один рядок, розділяючи їх пробілом
        for (int i = 0; i < 10; i++) {
            // Виводимо поточний елемент масиву
            System.out.print(roundScores[i]);

            // Додаємо пробіл між елементами, окрім останнього
            if (roundScores[i] != 10)
                System.out.print(" ");
        }

    }
}