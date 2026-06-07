package ua.javarush.java.core.level02.task20;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для зчитування даних з консолі
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо ім’я користувача (рядок)
        System.out.println("Введіть своє їм'я: ");
        String name = scanner.nextLine();

        // Зчитуємо вік користувача (ціле число)
        System.out.println("Введіть свій вік: ");
        int age = scanner.nextInt();

        // Виводимо відформатовану візитну картку
        System.out.println("Мене звати " + name + ", мені " + age + " років.");

    }
}