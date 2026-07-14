package ua.javarush.java.core.level04.task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // змінна для зберігання обраного пункту меню
        int item;

        // Використовуємо do-while, щоб меню показувалося щонайменше один раз і повторювалося до вибору "Вийти"
        do {
            // Виводимо меню в кожному циклі
            System.out.println("Меню:");
            System.out.println("1. Вивести привітання");
            System.out.println("2. Вийти");

            // Зчитуємо номер обраного пункту
            item = scanner.nextInt();

            // Обробка вибору
            if (item == 1/* умова */) {
                System.out.println("Привіт!");
            }
            // За вибору 2 цикл завершиться завдяки умові while нижче
            // Для інших значень просто знову покажемо меню
        } while (item != 2/* умова */);
    }
}