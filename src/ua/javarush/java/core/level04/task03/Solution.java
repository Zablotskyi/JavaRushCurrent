package ua.javarush.java.core.level04.task03;

public class Solution {
    public static void main(String[] args) {
        // Ініціалізуємо змінну для номера крісла
        int place = 2;

        // Використовуємо цикл while для перебирання номерів крісел
        while (place <= 10) {
            // Виводимо поточний номер крісла на новому рядку
            System.out.println(place);

            // Збільшуємо номер крісла на 2
            place += 2;
        }
    }
}