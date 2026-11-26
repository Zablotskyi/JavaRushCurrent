package ua.javarush.java.core.level08.task09;

public class Solution {

    // Метод для створення персоналізованого привітання
    public static String generateGreetingMessage(String recipientName) {
        // Формуємо рядок привітання з використанням переданого імені
        return "Привіт, " + recipientName + "!";
    }

    public static void main(String[] args) {
        // Викликаємо метод generateGreetingMessage з ім’ям "Аліса"
        String greeting = generateGreetingMessage("Аліса");

        // Виводимо результат на екран
        System.out.println(greeting);
    }
}