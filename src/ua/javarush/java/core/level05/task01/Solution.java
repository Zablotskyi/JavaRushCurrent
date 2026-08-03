package ua.javarush.java.core.level05.task01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача висоту драбини
        int ladderHeight = scanner.nextInt();

        // Зовнішній цикл — за кількістю сходинок (рядків)
        for (int i = 0; i < ladderHeight; i++) {
            // Внутрішній цикл — виводить потрібну кількість символів '#'
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            // Перехід на новий рядок після кожної сходинки
            System.out.println();
        }
    }
}