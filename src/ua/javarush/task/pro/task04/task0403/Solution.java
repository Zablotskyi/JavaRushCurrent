package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}