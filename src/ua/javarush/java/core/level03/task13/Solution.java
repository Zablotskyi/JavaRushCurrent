package ua.javarush.java.core.level03.task13;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо початкові булеві змінні
        boolean toTheSea = true;
        boolean hasPlaneTickets = false;
        boolean hasHotelRooms = true;

        // Важливо: оператор && має вищий пріоритет, ніж ||
        // Тому спочатку обчиснюється (hasPlaneTickets && hasHotelRooms), потім результат об’єднується з toTheSea через ||
        boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms;

        // Виводимо результат на екран
        System.out.println(vacationHappened);
    }
}