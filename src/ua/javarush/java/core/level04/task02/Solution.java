package ua.javarush.java.core.level04.task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = ""; // зберігатимемо введений користувачем текст

        // Запитуємо пароль, доки користувач не введе точне слово "java"
        while (!input.equals("java")) {
            System.out.println("Введіть пароль: ");
            input = console.nextLine();
        }

        // Повідомлення після успішного введення
        System.out.println("Смартфон розблоковано!");
    }
}