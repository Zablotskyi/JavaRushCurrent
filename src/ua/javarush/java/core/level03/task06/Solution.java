package ua.javarush.java.core.level03.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо обʼєкт Scanner для зчитування вводу з клавіатури
        Scanner console = new Scanner(System.in);

        // Запитуємо в користувача вік
        System.out.println("Введи свій вік:");
        int age = console.nextInt(); // Зчитуємо вік як ціле число
        console.nextLine(); // Поглинаємо залишений символ нового рядка

        // Запитуємо в користувача місто
        System.out.println("Введи своє місто:");
        String city = console.nextLine(); // Зчитуємо місто як рядок

        // Перевіряємо вік
        if (/* умова */) {
            // Якщо вік >= 21, перевіряємо місто
            if (/* умова */) {
                // Якщо місто "Київ", виводимо повідомлення про доступ

            } else {
                // Якщо місто не "Київ", виводимо повідомлення про відмову

            }
        } else {
            // Якщо вік < 21, виводимо повідомлення про відмову

        }
    }
}