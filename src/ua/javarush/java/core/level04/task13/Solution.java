package ua.javarush.java.core.level04.task13;

public class Solution {
    public static void main(String[] args) {
        // Перебираємо числа від 1 до 10 включно
        for (int i = 1/* ініціалізація */; i <= 10 /* умова */; i++ /* зміна */) {
            // Перевіряємо, чи є поточне число правильним кодом
            if (i == 5/* умова */) {
                // Якщо код знайдено, виводимо повідомлення
                System.out.println("Код знайдено! Замок відкрито");
                // Перериваємо цикл, оскільки код знайдено
                break;
            }
        }
    }
}