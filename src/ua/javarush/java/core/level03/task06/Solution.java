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
        if (age >= 21) {
            // Якщо вік >= 21, перевіряємо місто
            if (city.equals("Київ")) {
                // Якщо місто "Київ", виводимо повідомлення про доступ
                System.out.println("Ласкаво просимо до клубу, Київ!");
            } else {
                // Якщо місто не "Київ", виводимо повідомлення про відмову
                System.out.println("Вибач, вхід заборонено.");
            }
        } else {
            // Якщо вік < 21, виводимо повідомлення про відмову
            System.out.println("Вибач, вхід заборонено.");

        }
    }
}