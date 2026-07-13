package ua.javarush.java.core.level04.task05;

public class Solution {
    public static void main(String[] args) {
        // Цикл for для зворотного відліку від 5 до 1
        for (int i = 5/* ініціалізація */; i > 0 /* умова */; i-- /* зміна */) {
            // Виведення поточного числа з нового рядка
            System.out.println(i);
        }
        // Виведення привітання після завершення циклу
        System.out.println("З Новим роком!");
    }
}