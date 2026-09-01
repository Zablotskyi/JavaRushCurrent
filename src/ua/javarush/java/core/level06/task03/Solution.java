package ua.javarush.java.core.level06.task03;

public class Solution {
    public static void main(String[] args) {
        // Оголоси змінну типу char для зберігання загадкового символу руни
        char mysteryCharacter = 'Z';

        // Перетвори символ на його числовий код (Unicode) і збережи у змінну decryptedCode
        int decryptedCode = mysteryCharacter;

        // Виведи результат дослідження: рядок і розшифрований числовий код символу
        System.out.println("Код символу 'Z': " + decryptedCode);
    }
}