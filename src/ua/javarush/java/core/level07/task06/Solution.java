package ua.javarush.java.core.level07.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив фіксованої довжини 3 для улюблених фільмів
String[] favoriteMovies = new String[3];

        // Створюємо Scanner для читання рядків з клавіатури
Scanner scanner = new Scanner(System.in);

        // Зчитуємо три назви фільмів і зберігаємо по порядку в масиві
        for (int i = 0; i < favoriteMovies.length; i++) {
            favoriteMovies[i] = scanner.nextLine();
        }


        // Виводимо фільми у зворотному порядку: третій, другий, перший
        for (int i = favoriteMovies.length - 1; i >= 0; i--) {
            System.out.println(favoriteMovies[i]);
        }

    }
}