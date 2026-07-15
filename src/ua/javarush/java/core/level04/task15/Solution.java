package ua.javarush.java.core.level04.task15;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для зчитування даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Просимо користувача ввести ціле число більше 1
        System.out.println("Введіть ціле число більше 1");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Ви ввели число менше або дорівнює 1");
            return;
        }

        // Перевіряємо, чи є число простим
        boolean isTrue = false;

        // Цикл для пошуку першого дільника числа n
        for (int i = 2 /* ініціалізація */; i <= n - 1 /* умова */; i++ /* зміна */) {
            if (n % i == 0 /* умова */) { // Якщо n ділиться на i без остачі
                // Виводимо перший знайдений дільник
                System.out.println(i);
                // Встановлюємо прапорець, що число не просте
                isTrue = true;
                // Завершуємо цикл, оскільки дільник знайдено
                break;
            }
        }

        // Якщо дільник не знайдено, виводимо, що число просте
        if (isTrue == false /* умова */) {
            System.out.println("Число просте");
        }
    }
}