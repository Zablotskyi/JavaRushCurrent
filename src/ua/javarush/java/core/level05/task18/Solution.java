package ua.javarush.java.core.level05.task18;

public class Solution {
    public static void main(String[] args) {
        // Починаємо з числа 1
        int number = 1;

        // Використовуємо цикл while для перебору чисел
        while (true) {
            // Перевіряємо, чи ділиться поточне число на 7 без остачі
            if (number % 7 == 0) {
                // Якщо ділиться, виводимо результат
                System.out.println("Перше число, кратне 7: " + number);
                // Завершуємо цикл за допомогою break
                break;
            }
            // Збільшуємо число на 1
            number++;
        }
    }
}