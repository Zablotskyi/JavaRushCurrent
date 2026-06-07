package ua.javarush.java.core.level02.task17;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для зчитування даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо один рядок як пароль
        String pass = scanner.nextLine();


        // Виводимо введений пароль на екран
        System.out.println(pass);
    }
}