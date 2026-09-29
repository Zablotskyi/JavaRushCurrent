package ua.javarush.java.core.level06.task20;

public class Solution {
    public static void main(String[] args) {
        // Оголосимо змінну типу int для оцінки за контрольну
        int quizScore = 4;

        // Оголосимо змінну типу double для оцінки за проєкт
        double projectScore = 2.7;

        // Обчислимо точний середній бал (double) і збережемо в exactCourseAverage
        double exactCourseAverage = (quizScore + projectScore) / 2;

        // Перетворимо точний середній бал (double) на ціле число (int) і збережемо в roundedCourseAverage
        int roundedCourseAverage = (int) exactCourseAverage;

        // Виведемо точний середній бал на екран
        System.out.println(exactCourseAverage);

        // Виведемо округлений середній бал на екран
        System.out.println(roundedCourseAverage);
    }
}