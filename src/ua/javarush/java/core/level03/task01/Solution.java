package ua.javarush.java.core.level03.task01;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну visitorAge і одразу ініціалізуємо її значенням 17
        int visitorAge = 17;

        // Використовуємо оператор if-else для перевірки: якщо вік менше 18
        if (visitorAge < 18) {
            // У разі неповноліття виводимо повідомлення про заборону доступу
            System.out.println("Доступ заборонено");
        } else {
            // Інакше — вітаємо відвідувача
            System.out.println("Ласкаво просимо!");
        }
    }
}