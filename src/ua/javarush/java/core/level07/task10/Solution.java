package ua.javarush.java.core.level07.task10;

public class Solution {
    public static void main(String[] args) {
        // Створюємо двовимірний масив рядків 3x2 для відображення на табло
        String[][] displayGrid = new String[3][2];

        // Індексація в масивах починається з нуля:
        // третій рядок -> індекс 2, другий стовпець -> індекс 1
        displayGrid[2][1] = "Hello";

        // Виводимо елемент із третього рядка і другого стовпця для перевірки
        System.out.println(displayGrid[2][1]);
    }
}