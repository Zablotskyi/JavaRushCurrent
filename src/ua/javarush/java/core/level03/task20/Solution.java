package ua.javarush.java.core.level03.task20;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну віку відвідувача
        int visitorAge = 6;

        // Використовуємо вкладені тернарні оператори для визначення категорії квитка
        String ticketCategory = (visitorAge < 7) ? "Дитячий" :
                (visitorAge < 18) ? "Підлітковий" :
                        (visitorAge < 65) ? "Дорослий" : "Пенсійний";

        // Виводимо категорію квитка на екран
        System.out.println(ticketCategory);
    }
}