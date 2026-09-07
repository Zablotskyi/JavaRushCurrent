package ua.javarush.java.core.level06.task07;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну й присвоюємо їй ціну товару
        double productPrice = 1234.56789;

        // Форматуємо число так, щоб було рівно два знаки після коми

        // Виводимо відформатоване значення на екран
        System.out.println(String.format("%.2f", productPrice));
    }
}