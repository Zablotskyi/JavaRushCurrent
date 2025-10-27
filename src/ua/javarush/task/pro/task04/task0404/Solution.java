package ua.javarush.task.pro.task04.task0404;

/* 
Заповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int vertical = 5;

        while (vertical > 0) {
            int horizontal = 10;

            while (horizontal > 0) {
                System.out.print("Q");
                horizontal--;
            }
            System.out.println();
            vertical--;
        }
    }
}