package ua.javarush.java.core.level07.task17;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив із заданими значеннями
        int[] raceTimes = new int[] {7, 2, 9, 4, 1};

        // Сортуємо масив за зростанням за допомогою методу Arrays.sort
        Arrays.sort(raceTimes);

        // Виводимо відсортований масив на екран з використанням Arrays.toString
        System.out.println(Arrays.toString(raceTimes));
    }
}