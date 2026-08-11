package ua.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.print("Ти напав на сплячого дракона - дракон засмутився");

        // цикл бою
        while (knightHits > 0 && dragonHp > 0) {
            // Гравець вказує силу удару
            System.out.print("Сила удару (1-10): ");

            // Якщо надто сильно або надто слабо - то промах


            // віднімаємо здоровʼя у дракона і хід у гравця


            // перевірка, що дракона переможено

        }

        //перевірка, що лицар програв

    }
}