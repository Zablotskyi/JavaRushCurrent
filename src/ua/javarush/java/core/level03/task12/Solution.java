package ua.javarush.java.core.level03.task12;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну roomTemperature типу int
        int roomTemperature = 20;

        // Перевіряємо, чи перебуває roomTemperature у діапазоні від 20 до 25 включно
        boolean isComfortable = false;
        if (roomTemperature >= 20 && roomTemperature <= 25) {
            isComfortable = true;
        }

        // Виводимо значення змінної isComfortable на екран
        System.out.println(isComfortable);
    }
}