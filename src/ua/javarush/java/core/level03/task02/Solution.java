package ua.javarush.java.core.level03.task02;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну currentTemperature і присвоюємо їй значення -5
        int currentTemperature = -5;

        // Перевіряємо, чи менша температура за 0
        if (currentTemperature < 0) {
            // Якщо температура менша за 0, виводимо повідомлення про мороз
            System.out.println("Одягнися тепліше, на вулиці мороз!");
        } else {
            // Якщо температура не менша за 0, виводимо повідомлення про легкий одяг
            System.out.println("Можна йти в легкому одязі!");
        }
    }
}