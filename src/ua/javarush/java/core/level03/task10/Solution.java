package ua.javarush.java.core.level03.task10;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо та присвоюємо рахунок нашої команди й суперника
        int ourScore = 3;
        int opponentScore = 1;

        // weWon — результат логічного порівняння: true, якщо наш рахунок більший
        boolean weWon = ourScore > opponentScore;

        // Виводимо значення змінної weWon на екран
        System.out.println(weWon);
    }
}