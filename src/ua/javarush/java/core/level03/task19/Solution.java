package ua.javarush.java.core.level03.task19;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну currentHour, яка зберігає поточну годину (від 0 до 23)
        int currentHour = 23;

        // Використовуємо тернарний оператор для вибору привітання
        String greetingMessage = (currentHour < 12) ? "Добрий ранок" : "Добрий день";

        // Виводимо привітальне повідомлення на екран
        System.out.println(greetingMessage);
    }
}