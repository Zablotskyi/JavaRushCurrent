package ua.javarush.java.core.level04.task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Scanner для зчитування введення з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Змінна для зберігання суми всіх продажів
        int sum = 0;

        // Нескінченний цикл для введення даних
        while (true) {
            // Запитуємо суму продажу
            System.out.println("Введіть суму продажу");
            // Зчитуємо введене число
            int price = scanner.nextInt();

            // Якщо введено від’ємне число, виходимо з циклу
            if (price < 0 /* умова */) {
                break;
            }

            // Додаємо додатне число до загальної суми
            sum += price;
        }

        // Виводимо підсумкову суму всіх продажів
        System.out.println(sum);
    }
}