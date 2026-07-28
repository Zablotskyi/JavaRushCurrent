package ua.javarush.java.core.level04.task17;

public class Solution {
    public static void main(String[] args) {
        // Зовнішній цикл для рядків (i від 0 до 2)
        for (int i = 0; i < 3; i++) {
            // Внутрішній цикл для стовпців (j від 0 до 3)
            for (int j = 0; j < 4; j++) {
                // Виведення координат поточної клітинки у форматі i,j
                System.out.print(i + "," + j);
                // Додаємо пробіл між координатами в рядку, окрім останньої
                if (i != 3) {
                    System.out.print(" ");
                }
            }
            // Перехід на новий рядок після завершення внутрішнього циклу
            System.out.println();
        }
    }
}