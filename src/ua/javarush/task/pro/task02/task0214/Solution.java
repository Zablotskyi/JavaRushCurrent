package ua.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Читання і перетворення рядків
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        String firstString = scan.nextLine();
        String secondString = scan.nextLine();
        String thirdString = scan.nextLine();

        System.out.println(thirdString);
        System.out.println(secondString.toUpperCase());
        System.out.println(firstString.toLowerCase());

    }
}
