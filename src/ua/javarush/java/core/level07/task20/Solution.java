package ua.javarush.java.core.level07.task20;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Створюємо основний код доступу
        int[] mainCode = new int[]{3, 6, 9, 12};
        // Створюємо резервний код доступу
        int[] backupCode = new int[]{3, 6, 9, 12};

        // Порівнюємо вміст двох масивів поелементно за допомогою Arrays.equals
        boolean resul = Arrays.equals(mainCode, backupCode);

        // Виводимо результат порівняння (true, якщо масиви ідентичні, інакше false)
        System.out.println(resul);
    }
}