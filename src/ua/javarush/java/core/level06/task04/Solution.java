package ua.javarush.java.core.level06.task04;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну secretSpellCode типу int і надаємо їй значення 8364
        int secretSpellCode = 8364;

        // Явно приводимо число secretSpellCode до типу char і зберігаємо в revealedSymbol
        char revealedSymbol = (char) secretSpellCode;

        // Виводимо символ, що відповідає коду 8364
        System.out.println("Символ з кодом 8364: " + revealedSymbol);

        // Оголошуємо змінну enigmaticLetter типу char і надаємо їй символ 'Ж'
        char enigmaticLetter = 'Ж';

        // Явно приводимо символ enigmaticLetter до типу int і зберігаємо в numericEssenceOfLetter
        int numericEssenceOfLetter = enigmaticLetter;

        // Виводимо числовий код символу 'Ж'
        System.out.println("Код символу 'Ж': " + numericEssenceOfLetter);
    }
}