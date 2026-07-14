package ua.javarush.java.core.level04.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для зчитування пароля з клавіатури
        Scanner scanner = new Scanner(System.in);

        // змінна для введеного пароля
        String password;

        // Цикл do-while гарантує щонайменше один запит пароля
        do {
            // Запитуємо введення пароля
            System.out.println("Введіть надійний пароль:");
            // зчитуємо рядок повністю
            password = scanner.nextLine();

        } while (password.length() < 6/* умова */); // повторюємо, доки пароль коротший за 6 символів

        // Повідомлення про успішну реєстрацію
        System.out.println("Пароль надійний, акаунт створено!");
    }
}