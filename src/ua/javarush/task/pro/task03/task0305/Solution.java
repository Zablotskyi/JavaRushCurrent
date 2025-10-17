package ua.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
            return;
        }
        if (a == b) {
            System.out.println(a + " " + b);
        }
        if (b == c) {
            System.out.println(b + " " + c);
        }
        if (a == c) {
            System.out.println(a + " " + c);
        }
    }
}
