package ua.javarush.java.core.level05.task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Попроси користувача ввести рядок (послання)
        System.out.println("Введіть рядок (послання): ");
        String magicMessage = scanner.nextLine();
        String newLine = "";

        // Розгорни рядок за допомогою циклу for
        for (int i = magicMessage.length() - 1; i >= 0; i--) {
            newLine = newLine + magicMessage.charAt(i);
        }

        // Виведи інвертований рядок
        System.out.println(newLine);

    }
}