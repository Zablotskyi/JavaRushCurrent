package ua.javarush.java.core.level06.task13;

public class Solution {
    public static void main(String[] args) {
        // Початкова оцінка кількості металу (у тоннах) із дробовою частиною
        double rawMetalEstimate = 789.456;

        // Округлюємо до найближчого цілого числа за допомогою Math.round (результат типу long)
        int newrawMetalEstimate = (int) Math.round(rawMetalEstimate);

        // Виводимо округлене значення на екран
        System.out.println(newrawMetalEstimate);
    }
}