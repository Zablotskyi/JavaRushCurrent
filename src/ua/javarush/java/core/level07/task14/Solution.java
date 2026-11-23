package ua.javarush.java.core.level07.task14;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо й ініціалізуємо зубчастий масив guestLists,
        // де кожен вкладений рядок — список гостей за окремим столом
        String[][] guestLists = new String[3][];
        // Стіл 1: двоє гостей
        guestLists[0] = new String[]{"Анна", "Василь"};
        // Стіл 2: троє гостей
        guestLists[1] = new String[]{"Сергій", "Микола", "Віктор"};
        // VIP-стіл 3: один гість
        guestLists[2] = new String[]{"Віталій"};

        // Зовнішній цикл for-each: перебираємо кожен підмасив (кожен стіл)
        for (String[] row : guestLists) {
            // Внутрішній цикл for-each: виводимо по черзі імена гостей поточного столу
            for (String collum : row) {
                // виводимо ім’я і пробіл
                System.out.print(collum + " ");
            }
            // Після виведення всіх гостей одного столу — перехід рядка
            System.out.println();
        }
    }
}