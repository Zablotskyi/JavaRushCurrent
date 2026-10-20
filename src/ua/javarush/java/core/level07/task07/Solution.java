package ua.javarush.java.core.level07.task07;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив зі швидкою ініціалізацією
        int[] itemPrices = {5, 7, 2, 9};

        // Змінна для зберігання суми
        int sum = 0;

        // Підсумовуємо всі елементи масиву
        for (int i = 0; i < itemPrices.length; i++) {
            sum += itemPrices[i];
        }


        // Виводимо підсумкову суму на екран
        System.out.println(sum);
    }
}