package ua.javarush.java.core.level03.task18;

public class Solution {
    public static void main(String[] args) {
        // Оголоси змінну orderNumber і присвой їй значення
        int orderNumber = 69;

        // Використай тернарний оператор для визначення парності orderNumber
        String orderStatus = (orderNumber % 2 == 0) ? "Парний" : "Непарний";

        // Виведи результат на екран
        System.out.println(orderStatus);
    }
}