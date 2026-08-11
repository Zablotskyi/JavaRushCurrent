package ua.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.println("Ти напав на сплячого дракона - дракон засмутився");

        // цикл бою
        while (knightHits != 0 | dragonHp != 0) {
            // Гравець вказує силу удару
            System.out.print("Сила удару (1-10): ");

            // Якщо надто сильно або надто слабо - то промах
            int strong = console.nextInt();
            if (strong < 1 | strong > 10) {
                knightHits--;
                continue;
            }

            // віднімаємо здоровʼя у дракона і хід у гравця
            dragonHp -= strong;
            knightHits--;

            // перевірка, що дракона переможено
            if (dragonHp <= 0) {
                System.out.println("Дракона переможено!");
                return;
            }
            //перевірка, що лицар програв
            if (knightHits <= 0 && dragonHp > 0) {
                System.out.println("Лицар програв!");
                return;
            }
        }
    }
}