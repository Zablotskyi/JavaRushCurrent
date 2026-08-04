package ua.javarush.java.core.level05.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо обʼєкт Scanner для введення даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Просимо користувача ввести число N (magicLimit)
        System.out.println("Введіть верхню межу чисел: ");
        int magicLimit = scanner.nextInt();

        // Обчислюємо та виводимо квадрат кожного числа від 1 до N
        for (int i = 1; i <= magicLimit; i++) {
            // Виведення квадрата числа
            System.out.println(i * i);
        }
    }
}