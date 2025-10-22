package ua.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатні чверті
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int coordinateX = scanner.nextInt();
        int coordinateY = scanner.nextInt();
        if (coordinateX > 0 && coordinateY > 0)
            System.out.println("1");
        if (coordinateX < 0 && coordinateY > 0)
            System.out.println("2");
        if (coordinateX < 0 && coordinateY < 0)
            System.out.println("3");
        if (coordinateX > 0 && coordinateY < 0)
            System.out.println("4");
    }
}