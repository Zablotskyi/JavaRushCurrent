package ua.javarush.java.core.level08.task15;

public class Solution {

    // Міняє місцями значення перших двох елементів масиву
    public static void swapPlayerNumbers(int[] teamLineup) {

    }

    public static void main(String[] args) {
        // Початкове розташування гравців: 7 і 9
        int[] playerSquad = {7, 9};

        // Передаємо масив у метод — зміни відбудуться над тим самим об’єктом масиву
        swapPlayerNumbers(playerSquad);

        // Перевіряємо результат: очікується "9 7"
        System.out.println(playerSquad[0] + " " + playerSquad[1]);
    }
}