package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int horizontal = 20;
        int vertical = 10;

        while (vertical > 0) {
            if (vertical == 10 || vertical == 1) {
                while (horizontal > 0) {
                    System.out.print("Б");
                    horizontal--;
                }
            } else {
                while (horizontal > 0) {
                    if (horizontal == 20 || horizontal == 1) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }
                    horizontal--;
                }
            }
            System.out.println();
            horizontal = 20;
            vertical--;
        }
    }
}