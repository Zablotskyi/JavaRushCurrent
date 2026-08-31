package ua.javarush.java.core.level05.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Розмір шахівниці 8x8

        // Зовнішній цикл — за рядками
        for (int i = 0; i < 8; i++) {
            // Внутрішній цикл — за клітинками рядка
            for (int j = 0; j < 8; j++) {
                // Чергуємо клітинки за сумою індексів: парна — "##", непарна — "__"
                if ((i + j) % 2 == 0) {
                    System.out.print("##");
                } else {
                    System.out.print("__");
                }
            }
            // Перенесення рядка після кожного рядка шахівниці (без зайвих пробілів)
            System.out.println();
        }
    }
}