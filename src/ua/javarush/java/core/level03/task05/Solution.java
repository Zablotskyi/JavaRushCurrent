package ua.javarush.java.core.level03.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо обʼєкт Scanner для введення даних з клавіатури
        Scanner console = new Scanner(System.in);

        // Запитуємо у користувача вік
        System.out.println("Введи свій вік:");
        int age = console.nextInt(); // Зчитуємо вік як ціле число
        console.nextLine(); // Поглинаємо символ нового рядка, що залишився

        // Запитуємо у користувача секретний код
        System.out.println("Введи секретний код:");
        String secretCode = console.nextLine(); // Зчитуємо секретний код як рядок

        // Перевіряємо вік
        if (/* умова */) {
            // Якщо вік >= 18, перевіряємо секретний код
            if (/* умова */) {
                // Якщо код дорівнює "OPEN", дозволяємо вхід

            } else {
                // Якщо код не дорівнює "OPEN", забороняємо вхід

            }
        } else {
            // Якщо вік < 18, забороняємо вхід

        }
    }
}