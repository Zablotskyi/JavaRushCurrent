package ua.javarush.java.core.level08.task05;

public class PersonalGreeter {
    // Статичний метод для привітання нового користувача
    public static void welcomeNewUser(String userName) {
        // Формуємо рядок привітання і виводимо його на екран
        System.out.println("Вітаємо тебе, " + userName);
    }

    public static void main(String[] args) {
        // Викликаємо метод welcomeNewUser з ім’ям "Аня"
        welcomeNewUser("Аня");
    }
}