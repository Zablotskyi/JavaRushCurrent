package ua.javarush.java.core.level04.task09;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну gameVersion і присвоюємо їй значення 10
        int gameVersion = 10;

        // Використовуємо цикл do-while для виконання дій принаймні один раз
        do {
            // Виводимо повідомлення "Завантаження даних..."
            System.out.println("Завантаження даних...");
            // Виводимо значення змінної gameVersion
            System.out.println(gameVersion);
        } while (false/* умова */); // Умова виходу з циклу відразу хибна
    }
}