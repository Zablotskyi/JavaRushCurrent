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


            // Перевіряємо смерть дракона


            // Хід дракона: перша голова атакує


            // Хід дракона: друга голова атакує

            
            // Поточний стан і перевірка смерті лицаря

        }
    }
}