package ua.javarush.java.core.level07.task18;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив рядків довжиною 6 елементів
        String[] warehouseSlots = new String[6];

        // Заповнюємо всі елементи масиву значенням "Empty" за допомогою методу Arrays.fill
        Arrays.fill(warehouseSlots, "Empty");

        // Виводимо масив на екран у форматі [Empty, Empty, Empty, Empty, Empty, Empty]
        System.out.println(Arrays.toString(warehouseSlots));
    }
}