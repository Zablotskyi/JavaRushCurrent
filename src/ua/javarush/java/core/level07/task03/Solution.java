package ua.javarush.java.core.level07.task03;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо масив для зберігання чотирьох показників датчиків
        double[] sensorReadings = new double[4];

        // В елемент з індексом 2 (третій за рахунком) записуємо значення 3.14
        sensorReadings[2] = 3.14;

        // Виводимо всі значення масиву в один рядок, розділяючи їх пробілом
        for (int i = 0; i < 4; i++) {
            System.out.print(sensorReadings[i]);

            // Після кожного елемента, окрім останнього, виводимо пробіл
            if (i != 3)
            System.out.print(" ");
        }
    }
}