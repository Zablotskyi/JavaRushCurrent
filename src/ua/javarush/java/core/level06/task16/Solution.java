package ua.javarush.java.core.level06.task16;

import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо й ініціалізуємо суму світових продажів (у мільйонах)
        double totalGlobalSales = 12345678.9012;

        // Шаблон "#,##0.00" — додає розділювачі тисяч і рівно 2 знаки після коми
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        // Форматуємо й виводимо результат на екран
        System.out.println(decimalFormat.format(totalGlobalSales));
    }
}