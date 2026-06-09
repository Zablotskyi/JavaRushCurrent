package ua.javarush.java.core.level03.task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для введення даних з клавіатури
        Scanner console = new Scanner(System.in);

        // Запитуємо вік користувача
        System.out.println("Введи свій вік:");
        int age = console.nextInt();
        console.nextLine(); // Зчитуємо залишений символ нового рядка

        // Запитуємо наявність клубної картки
        System.out.println("У тебе є клубна картка? (так/ні):");
        String hasClubCard = console.nextLine().trim().toLowerCase();

        // Перевіряємо умови для визначення знижки
        if (age >= 65) {
            // Якщо вік 65 або більше, надаємо знижку 20%
            System.out.println("Твоя знижка: 20%.");
        } else {
            // Якщо вік менший за 65, перевіряємо наявність клубної картки
            if (hasClubCard.equals("так")) {
                // Якщо є клубна картка, надаємо знижку 10%
                System.out.println("Твоя знижка: 10%.");
            } else {
                // В усіх інших випадках знижки немає
                System.out.println("Знижки немає.");
            }
        }
    }
}