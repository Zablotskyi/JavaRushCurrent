package ua.javarush.java.core.level04.task20;

public class Solution {
    public static void main(String[] args) {
        // Зовнішній цикл перебирає значення i від 1 до 10
        for (int i = 1; i <= 10; i++) {
            // Внутрішній цикл перебирає значення j від 1 до 10
            for (int j = 1; j <= 10; j++) {
                // Перевіряємо, чи дорівнює сума i та j числу 13
                if (i + j == 13) {
                    // Якщо сума дорівнює 13, виводимо результат
                    System.out.println("Пароль знайдено: i=" + i + ", j=" + j);
                    // Завершуємо обидва цикли за допомогою return
                    return;
                }
            }
        }
    }
}