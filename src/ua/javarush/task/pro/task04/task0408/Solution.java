package ua.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                if (number > max)
                    max = number;
            }
        }
        System.out.println(max);
    }
}