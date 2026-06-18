package ua.javarush.java.core.level03.task17;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо дві змінні для часу спортсменів
        int alexsTime = 10;
        int mikesTime = 9;

        // Використовуємо тернарний оператор для визначення мінімального часу
        int fastestTime = (alexsTime < mikesTime) ? alexsTime : mikesTime;

        // Виводимо на екран найменший час
        System.out.println(fastestTime);
    }
}