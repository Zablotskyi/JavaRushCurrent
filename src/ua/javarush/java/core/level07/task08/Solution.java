package ua.javarush.java.core.level07.task08;

public class Solution {
    public static void main(String[] args) {
        // Швидка ініціалізація масиву з 6 елементами температур
int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};

        // Припускаємо, що перший елемент масиву є максимальним
int maxTemperatures = hourlyTemperatures[0];

        // Проходимо всі елементи масиву, починаючи з другого
        for (int i = 1; i < hourlyTemperatures.length; i++) {
            // Якщо поточна температура більша за збережену максимальну

            // Оновлюємо максимальну температуру
            if (hourlyTemperatures[i] > maxTemperatures) {
                maxTemperatures = hourlyTemperatures[i];
            }
        }



        // Виводимо знайдену максимальну температуру
        System.out.println(maxTemperatures);
    }
}