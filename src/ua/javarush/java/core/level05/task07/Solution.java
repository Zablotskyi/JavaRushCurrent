package ua.javarush.java.core.level05.task07;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.BigDecimal.*;

public class Solution {
    
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для зчитування даних з консолі
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо велике число, введене користувачем
        String treasureAmount = scanner.nextLine();

        treasureAmount.trim();

        if (treasureAmount.startsWith("-")) {
            treasureAmount = treasureAmount.substring(1);
        }

        // Виводимо кількість цифр у числі
        System.out.println(treasureAmount.length());
    }
}