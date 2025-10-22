package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Трикутник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int firsSideTriangle = scanner.nextInt();
        int secondSideTriangle = scanner.nextInt();
        int thirdSideTriangle = scanner.nextInt();

        if (firsSideTriangle < secondSideTriangle + thirdSideTriangle &&
                secondSideTriangle < firsSideTriangle + thirdSideTriangle &&
                thirdSideTriangle < firsSideTriangle + secondSideTriangle)
            System.out.println(TRIANGLE_EXISTS);
        else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
