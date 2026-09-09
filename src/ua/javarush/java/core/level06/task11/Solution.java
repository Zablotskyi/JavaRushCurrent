package ua.javarush.java.core.level06.task11;

public class Solution {
    public static void main(String[] args) {
        // Обчислюємо квадратний корінь з -1 за допомогою Math.sqrt
        double mysticAnomaly = Math.sqrt(-1);

        // Виводимо значення mysticAnomaly на екран
        System.out.println(mysticAnomaly);

        // Перевіряємо, чи є mysticAnomaly NaN (Not a Number)
        boolean result = Double.isNaN(mysticAnomaly);

        // Виводимо результат перевірки на екран
        System.out.println(result);
    }
}