package ua.javarush.java.core.level06.task09;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну mixtureResult і присвоюємо їй результат додавання 0.1 + 0.2
        double mixtureResult = 0.1 + 0.2;

        // Оголошуємо змінну expectedConcentration і присвоюємо їй значення 0.3
        double expectedConcentration = 0.3;

        // Порівнюємо значення змінних mixtureResult і expectedConcentration за допомогою оператора ==
        boolean result = mixtureResult == expectedConcentration;

        // Виводимо результат порівняння на екран
        System.out.println(result);
    }
}