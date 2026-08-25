package ua.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартові очки здоровʼя
        int knightHp = 100;
        int dragonHp = 50;

        // Дракон загадує прихований максимум удару 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввід сили удару лицаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва почалася! У лицаря 100 життів, у дракона 50 життів.");

        // Основний бойовий цикл
        while (true) {
            // Хід лицаря: промах, якщо перевищує прихований максимум
            System.out.println("Задайте силу удару лицаря:");
            int knightMax = console.nextInt();

            // Перевіряємо смерть дракона
            if (knightMax <= dragonMax) {
                if (knightMax >= 1 && knightMax <= 20) {
                    dragonHp -= knightMax;
                }
            }

            if (dragonHp <= 0) {
                System.out.println("Лицар переміг!");
                return;
            }

            // Хід дракона: перша голова атакує
            int firstDragonMax = rand.nextInt(10) + 1;

            // Хід дракона: друга голова атакує
            int secondDragonMax = rand.nextInt(10) + 1;

            // Поточний стан і перевірка смерті лицаря
            knightHp -= firstDragonMax + secondDragonMax;
            System.out.println("Життів лицаря: " + knightHp + " Життів дракона: " + dragonHp);

            if (knightHp <= 0) {
                System.out.println("Дракон переміг!");
                return;
            }
        }
    }
}