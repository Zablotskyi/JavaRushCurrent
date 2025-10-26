package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        if (firstString.equals(secondString))
        System.out.println("рядки однакові");
        //напишіть тут ваш код
        if (!firstString.equals(secondString))
        System.out.println("рядки різні");
    }
}
