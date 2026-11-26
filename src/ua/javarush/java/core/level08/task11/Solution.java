package ua.javarush.java.core.level08.task11;

public class Solution {

    // Метод getHigherScore приймає два цілих числа і повертає більше з них
    public static int getHigherScore(int playerOneScore, int playerTwoScore) {
        // Використовуємо умовний оператор для порівняння двох чисел
        return (playerOneScore > playerTwoScore ? playerOneScore : playerTwoScore);
    }

    public static void main(String[] args) {
        // Тестові дані: очки двох гравців
        int playerOneScore = 10;
        int playerTwoScore = 25;

        // Виклик методу getHigherScore і збереження результату в змінну championsScore
        int championsScore = getHigherScore(playerOneScore, playerTwoScore);

        // Виведення на екран найвищого бала
        System.out.println("Найвищий бал: " + championsScore);
    }
}