package ua.javarush.java.core.level06.task10;

public class Solution {
    public static void main(String[] args) {
        // Ділимо 1.0 на 0.0: у світі double це не помилка, а додатна нескінченність
        double cosmicEvent = 1.0 / 0.0;

        // Виводимо значення змінної (очікується "Infinity")
        System.out.println(cosmicEvent);

        // Підтверджуємо, що значення справді нескінченність
        System.out.println(Double.isInfinite(cosmicEvent));
    }
}