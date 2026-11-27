package ua.javarush.java.core.level08.task14;

public class Solution {

    public static void main(String[] args) {
        // Створюємо масив із початковими бонусами гравця
        int[] myBonusCollection = {1, 2, 3};

        // Викликаємо метод tryToSwapBonusList, передаючи масив myBonusCollection
        tryToSwapBonusList(myBonusCollection);

        // Виводимо перший елемент масиву myBonusCollection
        // Очікуємо, що він залишиться рівним 1, адже масиви передаються за значенням посилання
        System.out.println(myBonusCollection[0]);
    }

    public static void tryToSwapBonusList(int[] playerCurrentBonuses) {


    }
}