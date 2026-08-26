package ua.javarush.java.core.level05.task15;

public class Main {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner, використовуючи повне ім’я класу
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Зчитуємо рядок, введений користувачем
        String line = scanner.nextLine();

        // Виводимо зчитаний рядок на екран
        System.out.println(line);
    }
}