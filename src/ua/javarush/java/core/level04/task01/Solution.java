package ua.javarush.java.core.level04.task01;

public class Solution {
    public static void main(String[] args) {
        // Ініціалізуємо змінну для зворотного відліку
        int count = 3;

        // Цикл while виконується, доки значення countdown більше 0
        while (count > 0) {
            // Виводимо поточне значення countdown
            System.out.println(count);
            // Зменшуємо значення countdown на 1
            count--;
        }

        // Після завершення циклу виводимо повідомлення "Старт!"
        System.out.println("Старт!");
    }
}