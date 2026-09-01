package ua.javarush.java.core.level06.task01;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо рівень персонажа (тип byte)
        byte characterLevel = 1;
        // Оголошуємо показник броні (тип short)
        short armorRating = 3;
        // Оголошуємо накопичений досвід (тип int)
        int experiencePoints = 100;
        // Оголошуємо кількість золотих монет (тип long)
        long goldCoins = 1000;
        // Оголошуємо опір магії (тип float)
        float magicResistance = 80f;
        // Оголошуємо шанс критичного удару (тип double)
        double criticalHitChance = 15.3;

        // Виводимо кожну характеристику героя з нового рядка
        System.out.println(characterLevel);
        System.out.println(armorRating);
        System.out.println(experiencePoints);
        System.out.println(goldCoins);
        System.out.println(magicResistance);
        System.out.println(criticalHitChance);
    }
}