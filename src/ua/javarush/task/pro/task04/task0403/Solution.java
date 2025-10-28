package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int number = 0;

        number = Integer.parseInt(scanner.nextLine());
        while (scanner.hasNextInt()) {
            number = number + Integer.parseInt(s = scanner.nextLine());
            isExit = s.equals("ENTER");
        }
        System.out.println(number);
    }
}