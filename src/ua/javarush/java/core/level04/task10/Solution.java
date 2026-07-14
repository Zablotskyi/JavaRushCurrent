package ua.javarush.java.core.level04.task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для читання даних із клавіатури
        Scanner scanner = new Scanner(System.in);
        int PIN;

        // Використовуємо do-while, щоб запитати PIN хоча б один раз
        // і повторювати введення, поки число не буде в діапазоні 1000..9999
        do {
            // Запит введення PIN-коду
            System.out.println("Введіть PIN код");
            // читаємо ціле число
            PIN = scanner.nextInt();

        } while (PIN < 1000 || PIN > 9999 /* умова */);

        // Виводимо повідомлення про прийняття PIN-коду
        System.out.println("PIN-код прийнято");
    }
}