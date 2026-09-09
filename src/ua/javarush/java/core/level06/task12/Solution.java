package ua.javarush.java.core.level06.task12;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну actualFrequency і присвоюємо їй значення 0.1 + 0.2
        double actualFrequency = 0.1 + 0.2;

        // Оголошуємо змінну targetFrequency і присвоюємо їй значення 0.3
        double targetFrequency = 0.3;

        // Оголошуємо змінну tolerance і задаємо їй значення 0.000001
        double tolerance = 0.000001;

        // Обчислюємо абсолютну різницю між actualFrequency і targetFrequency

        // Порівнюємо різницю з допуском і виводимо відповідне повідомлення
        if (Math.abs(actualFrequency - targetFrequency) < tolerance) {
            System.out.println("Лазер відкалібровано з допустимою точністю");
        } else {
            System.out.println("Потрібне додаткове калібрування");
        }

    }
}