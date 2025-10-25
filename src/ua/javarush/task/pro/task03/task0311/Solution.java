package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        if (Math.abs(secondNumber - firstNumber) < 0.000001)
            System.out.println("числа рівні");
            //напишіть тут ваш код
        else
            System.out.println("числа не рівні");
    }
}
