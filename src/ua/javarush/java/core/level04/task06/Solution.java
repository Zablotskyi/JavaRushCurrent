package ua.javarush.java.core.level04.task06;

public class Solution {
    public static void main(String[] args) {
        // Використовуємо цикл for для перебору чисел від 0 до 10 включно
        for (int i = 0 /* ініціалізація */; i <= 10 /* умова */; i++ /* зміна */) {
            // Перевіряємо, чи є поточне число парним
            if (i % 2 == 0 /* умова */) {
                // Якщо число парне, виводимо його на екран
                System.out.println(i);
            }
        }
    }
}