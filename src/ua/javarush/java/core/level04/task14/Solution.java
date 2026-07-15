package ua.javarush.java.core.level04.task14;

public class Solution {
    public static void main(String[] args) {
        // Масив з оцінками товарів
        int[] productRatings = {3, -2, 7, -5, 8, 0};

        // Цикл for для перебору всіх елементів масиву
        for (int rating : productRatings) {
            // Якщо товар бракований (від’ємне число), пропускаємо його
            if (/*умова */) {
                      // Перехід до наступної ітерації циклу
            }

            // Виводимо на екран лише якісні товари (додатні числа або 0)
            System.out.println(rating);
        }
    }
}