package ua.javarush.java.core.level06.task15;

import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну для квартального доходу й присвоюємо їй значення
        double quarterlyRevenue = 125.789;

        // Створюємо форматер, який завжди виводить рівно дві цифри після десяткової крапки
        // Шаблон "0.00" гарантує наявність щонайменше однієї цифри до десяткової крапки і двох після
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // Форматуємо число й виводимо результат на екран
        System.out.println(decimalFormat.format(quarterlyRevenue));
    }
}