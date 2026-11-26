package ua.javarush.java.core.level08.task10;

public class Solution {
    // Метод перевіряє, чи ділиться число на 2 без остачі
    public static boolean checkIfEven(int inputNumber) {
        // Оператор % повертає остачу від ділення
        return inputNumber % 2 == 0;
    }

    public static void main(String[] args) {
        // Перевіряємо число 18
        boolean isEven = checkIfEven(18);

        // Виводимо результат залежно від поверненого значення
        if (isEven) {
            System.out.println("Це число парне!");
        } else {
            System.out.println("Це число непарне!");
        }
    }
}