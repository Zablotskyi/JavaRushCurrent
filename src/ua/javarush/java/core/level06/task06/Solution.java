package ua.javarush.java.core.level06.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для зчитування даних із клавіатури
        Scanner scanner = new Scanner(System.in);

        // Просимо користувача ввести суму платежу
        System.out.println("Введіть суму платежу: ");

        // Зчитуємо введене значення та зберігаємо його у змінній типу double
        double customerPayment = scanner.nextDouble();

        // Підтверджуємо отриману суму, виводячи її на екран
        System.out.println("Внесено коштів: " + customerPayment);
    }
}