package ua.javarush.java.core.level07.task13;

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        // Створюємо зубчастий масив (кожен "рядок" може мати свою довжину)
        int[][] playerAchievements = new int[3][];
        // 1-й рівень: 2 досягнення
        playerAchievements[0] = new int[] {1, 2};
        // 2-й рівень: 4 досягнення
        playerAchievements[1] = new int[] {3, 4, 5, 6};
        // 3-й (бонусний) рівень: 1 досягнення
        playerAchievements[2] = new int[] {1};

        // Виводимо кожен рядок масиву в окремому рядку
        for (int i = 0; i < playerAchievements.length; i++) {
            for (int j = 0; j < playerAchievements[i].length; j++) {
                // Друкуємо елементи рядка, розділяючи пробілом
                // перед першим елементом пробіл не ставимо
                System.out.print(playerAchievements[i][j] + " ");
            }
            // перенесення рядка після кожного "рядка" масиву
            System.out.println();
        }
    }



}
