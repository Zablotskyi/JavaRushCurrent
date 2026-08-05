package ua.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо сканер для зчитування числа з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть висоту обеліска: ");
        int pyramidHeight = scanner.nextInt();

        // Будуємо обеліск рядок за рядком
        for (int i = 1; i <= pyramidHeight; i++) {
            // Кількість пробілів ліворуч: зменшується від (N - 1) до 0

            // Кількість зірочок: зростає за формулою (2 * row - 1)

            // Друкуємо пробіли для вирівнювання
            for (int j = pyramidHeight; j > i; j--) {
                System.out.print(" ");
            }

            // Друкуємо зірочки
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Перехід на новий рядок після кожного рядка обеліска
            System.out.println();
        }
    }
}