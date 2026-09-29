package ua.javarush.java.core.level06.task17;

public class Solution {
    public static void main(String[] args) {
        // Загальна маса матеріалу в кілограмах
        double totalMaterialWeight = 7.89;

        // Явно перетворюємо double на int — дробова частина відкидається
        int completeItemsCount = (int) totalMaterialWeight;

        // Виводимо кількість цілих предметів
        System.out.println(completeItemsCount);
    }
}