package ua.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Усі люблять Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любить мене.";
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 10;

        while (counter > 0) {
            System.out.println(name + text);
            counter--;
        }
    }
}
