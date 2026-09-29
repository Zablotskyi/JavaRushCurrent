package ua.javarush.java.core.level07.task02;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив рядків із фіксованим розміром 3
        String[] favoriteLanguages = new String[3];

        // Заповнюємо масив значеннями "Java"
        for (int i = 0; i < 3; i++) {
            favoriteLanguages[i] = "Java";
        }

        // Виводимо на екран кількість елементів, які здатен зберігати масив
        System.out.println(favoriteLanguages.length);

    }
}