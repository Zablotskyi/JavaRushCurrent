package ua.javarush.java.core.level04.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для читання даних із консолі
        Scanner scanner = new Scanner(System.in);

        // Сума всіх введених вартостей
        int sum = 0;

        // Запитуємо першу вартість чашки кави
        System.out.println("Введіть вартість кави: ");
        int price = scanner.nextInt();

        // Використовуємо цикл while для продовження введення доти, доки не буде введено від’ємне число
        while (price >= 0) {
            // Додаємо введену вартість до загальної суми
            sum += price;
            // Запитуємо наступну вартість
            System.out.println("Введіть вартість кави: ");
            price = scanner.nextInt();
        }

        // Виводимо підсумкову суму витрат на каву (від’ємне значення до суми не входить)
        System.out.println(sum);
    }
}