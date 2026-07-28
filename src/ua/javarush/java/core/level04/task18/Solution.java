package ua.javarush.java.core.level04.task18;

public class Solution {
    public static void main(String[] args) {
        // Зовнішній цикл відповідає за рядки (5 рядків)
        for (int i = 0; i < 5; i++) {
            // Внутрішній цикл відповідає за стовпці (7 стовпців)
            for (int j = 0; j < 7; j++) {
                // Виводимо символ "⭐" із пробілом
                System.out.print("⭐");
                System.out.print(" ");
            }
            // Після завершення рядка переходимо на новий рядок
            System.out.println();
        }
    }
}