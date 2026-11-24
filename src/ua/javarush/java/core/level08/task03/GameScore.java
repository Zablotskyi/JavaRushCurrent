package ua.javarush.java.core.level08.task03;

public class GameScore {
    // Приватний загальний рахунок для всієї гри — доступний лише всередині класу
    private static int totalGameScore = 0;

    // Збільшуємо рахунок на 1 щоразу, коли гравець збирає монетку
    public static void collectCoin() {
        totalGameScore++;
    }

    // Виводимо поточний загальний рахунок на екран
    public static void displayCurrentScore() {
        System.out.println(totalGameScore);
    }

    public static void main(String[] args) {
        // Гравець зібрав три монетки
        collectCoin();
        collectCoin();
        collectCoin();

        // Показуємо поточний рахунок
        displayCurrentScore();
    }
}