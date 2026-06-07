package ua.javarush.java.core.level02.task18;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для читання даних з клавіатури
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        // Запитуємо та зчитуємо ім’я гравця
        System.out.println("Введіть ім'я гравця: ");
        name = scanner.nextLine();

        // Запитуємо та зчитуємо вік гравця
        System.out.println("Введіть вік гравця: ");
        age = scanner.nextInt();

        // Спочатку виводимо вік, потім ім’я, кожне з нового рядка
        System.out.println(age);
        System.out.println(name);

    }
}