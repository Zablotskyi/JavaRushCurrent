package ua.javarush.java.core.level06.task05;

import javax.swing.table.TableRowSorter;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну journeyDistance і присвоюємо їй значення 150.0 (світлових років)
        double journeyDistance = 150.0;
        // Оголошуємо змінну travelTime і присвоюємо їй значення 2.5 (земних циклів)
        double travelTime = 2.5;

        // Обчислюємо середню швидкість: відстань ділимо на час
        double averageSpeed = journeyDistance / travelTime;

        // Виводимо результат обчислення середньої швидкості на екран
        System.out.println(averageSpeed);
    }
}