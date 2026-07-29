package ua.javarush.java.core.level04.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Розмір ігрового поля (8 рядків і 8 стовпців)

        // Зовнішній цикл за рядками
        for (int i = 1; i <= size; i++) {
            // Внутрішній цикл за стовпцями
            for (int j = 1; j <= size; j++) {
                // Клітинка біла, якщо сума індексів парна; інакше — чорна
                if ((i + j) % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print("#");
                }
            }
            // Перехід на новий рядок після кожного рядка поля
            System.out.println();
        }
    }
}