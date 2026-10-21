package ua.javarush.java.core.level07.task09;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо двовимірний масив theaterSeating розміром 2 рядки та 3 стовпці
int[][] theaterSeating = new int[2][3];

        // Заповнюємо масив числами від 1 до 6 по рядках
        // лічильник для присвоєння значень
        int seat = 1;
        for (int i = 0; i < theaterSeating.length; i++) {
            for (int j = 0; j < theaterSeating[i].length; j++) {
                // присвоюємо поточне значення і збільшуємо лічильник
                theaterSeating[i][j] = seat;
                seat++;
            }
        }

        // Виводимо на екран елемент у другому рядку та першому стовпці (індекс [1][0])
        System.out.println(theaterSeating[1][0]);
    }
}