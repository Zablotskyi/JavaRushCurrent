package ua.javarush.java.core.level08.task02;

public class Solution {
    public static void main(String[] args) {
        // Викличмо наш "калькулятор": додамо 7 і 5 та виведемо результат
        MathMagic.showSum(7, 5);
    }
}

// Клас-інструмент для простих математичних операцій
class MathMagic {
    // Статичний метод приймає два int, обчислює суму і виводить її
    public static void showSum(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}