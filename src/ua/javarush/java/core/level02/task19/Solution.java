package ua.javarush.java.core.level02.task19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для зчитування даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо ціни двох товарів як цілі числа
        System.out.println("Введіть ціну першого товару");
        int firstPrice = scanner.nextInt();
        System.out.println("Введіть ціну другого товару");
        int secondPrice = scanner.nextInt();

        // Додаємо та виводимо суму
        int sum = firstPrice + secondPrice;
        System.out.println("Загальна сума по всім товарам: " + sum);

    }
}