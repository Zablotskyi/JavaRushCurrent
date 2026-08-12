package ua.javarush.java.core.level05.task13;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Випадкова початкова кількість камінців 1..100
        Random rand = new Random();
        int stones = rand.nextInt(100) + 1;

        // Підготовка введення
        Scanner sc = new Scanner(System.in);
        System.out.println("Початок гри. У купі " + stones + " камінців.");

        // Основний цикл партії
        while (stones > 0) {
            // Хід гравця: вводимо, доки не потрапимо в допустимий діапазон
            int maxTake = Math.min(10, stones);
            int takePlayer;
            while (true) {
                System.out.print("Скільки камінців візьмеш (1-" + maxTake + "): ");


                
            }

            System.out.println("Гравець взяв " + takePlayer + ". Залишилося: " + stones);


            // Хід комп’ютера: беремо випадково, але не більше залишку
            int takeBot = Math.min(stones, rand.nextInt(10) + 1);

            System.out.println("Комп’ютер взяв " + takeBot + ". Залишилося: " + stones);
            if (stones == 0) {
                System.out.println("Комп’ютер переміг!");
                break;
            }
        }
    }
}