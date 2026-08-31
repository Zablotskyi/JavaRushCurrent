package ua.javarush.java.core.level05.task20;

public class Solution {
    public static void main(String[] args) {
        // Зовнішній цикл для чисел від 1 до 10 (рядки таблиці)
        for (int i = 1; i <= 10; i++) {
            // Внутрішній цикл для чисел від 1 до 10 (стовпці таблиці)
            for (int j = 1; j <= 10; j++) {
                // Виведення добутку з роздільником табуляції
                System.out.printf("%3d", i * j);
            }
            // Перехід на новий рядок після завершення рядка таблиці
            System.out.println();
        }
    }
}