package ua.javarush.java.core.level07.task05;

public class Solution {
    public static void main(String[] args) {
        // Швидка ініціалізація масиву з 5 елементів
        int[] gameHighScores = {10, 20, 30, 40, 50};

        // Виводимо кожен елемент з нового рядка
        for (int i = 0; i < gameHighScores.length; i++) {
            System.out.println(gameHighScores[i]);
        }
    }
}