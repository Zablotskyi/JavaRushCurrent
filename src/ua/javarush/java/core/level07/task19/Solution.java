package ua.javarush.java.core.level07.task19;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Вихідний масив температур за день
        int[] dailyTemperatures = new int[]{10, 20, 30, 40, 50, 60, 70};

        // Копіюємо елементи з індексами 2 (включно) до 5 (не включаючи 5): 30, 40, 50
        int[] copy = Arrays.copyOfRange(dailyTemperatures, 2, 5);

        // Виводимо отриманий підмасив у форматі [30, 40, 50]
        System.out.println(Arrays.toString(copy));
    }
}