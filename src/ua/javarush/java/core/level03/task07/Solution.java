package ua.javarush.java.core.level03.task07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Запитуємо та зчитуємо вік користувача
        System.out.println("Введи свій вік:");
        int age = Integer.parseInt(console.nextLine());

        // Запитуємо та зчитуємо код запрошення
        System.out.println("Введи код запрошення:");
        String code = console.nextLine().trim();

        // Вкладена логіка: спочатку перевіряємо вік, потім код
        if (age >= 21) {
            // Вік підходить — перевіряємо тип запрошення
            if (code.equals("VIP")) {
                System.out.println("Доступ до VIP-залу дозволено.");
            } else if (code.equals("GUEST")) {
                System.out.println("Гостьовий доступ дозволено.");
            } else {
                System.out.println("Невірний код запрошення.");
            }
        } else {
            // Вік менший за 21 — доступ заборонено
            System.out.println("На жаль, лише з 21 року.");
        }
    }
}