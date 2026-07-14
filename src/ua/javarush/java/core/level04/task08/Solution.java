package ua.javarush.java.core.level04.task08;

public class Solution {
    public static void main(String[] args) {
        // Використовуємо цикл for для одночасної зміни двох змінних
        for (int x = 1, y = 5/* ініціалізація */; x <= 5 /* умова */; x++, y-- /* зміна */) {
            // На кожній ітерації виводимо поточні значення x і y через пробіл
            System.out.println(x + " " + y);
        }
    }
}