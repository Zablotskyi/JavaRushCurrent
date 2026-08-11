package ua.javarush.java.core.level05.task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для читання даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо три цілих числа — тривалості трьох шляхів у хвилинах
        int pathOne = scanner.nextInt();
        int pathTwo = scanner.nextInt();
        int pathThree = scanner.nextInt();

        // Визначаємо мінімальну тривалість серед трьох значень
        int minPath;
        if (pathOne <= pathTwo && pathOne <= pathThree)
            minPath = pathOne;
        else if (pathTwo <= pathOne && pathTwo <= pathThree)
            minPath = pathTwo;
        else
            minPath = pathThree;

        // Виводимо результат
        System.out.println(minPath);
    }
}