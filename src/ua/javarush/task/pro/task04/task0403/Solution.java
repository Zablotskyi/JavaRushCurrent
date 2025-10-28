package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int number = 0;

        s = scanner.nextLine();
        while (!s.equals("ENTER")) {
            number = number + Integer.parseInt(s);
            s = scanner.nextLine();
        }
        System.out.println(number);
    }
}