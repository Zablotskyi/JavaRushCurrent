package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показуємо, що отримуємо
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str;

        while (true) {
            str = scanner.nextLine();
            if (str.equals("enough"))
                break;
            System.out.println(str);
        }

    }
}