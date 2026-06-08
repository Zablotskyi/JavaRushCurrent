package ua.javarush.java.core.level03.task04;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну currentHour і надаємо їй значення 20
        int currentHour = 20;

        // Використовуємо оператор if-else if-else для вибору потрібного привітання
        if (currentHour < 12) {
            // Якщо поточний час менше 12, вважаємо, що це ранок
            System.out.println("Доброго ранку!");
        } else if (currentHour >= 12 && currentHour <= 18) {
            // Якщо поточний час від 12 до 18 включно, вважаємо, що це день
            System.out.println("Добрий день!");
        } else {
            // В усіх інших випадках вважаємо, що це вечір
            System.out.println("Добрий вечір!");
        }
    }
}