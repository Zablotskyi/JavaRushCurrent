package ua.javarush.java.core.level03.task15;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо та ініціалізуємо змінні для умов допуску
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;

        // Основний логічний вираз без додаткових дужок
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;

        // Вираз із групуванням перших двох умов
        boolean first = (hasInvitation && dressCodeMet) && passwordIsCorrect;

        // Вираз із групуванням останніх двох умов
        boolean second = hasInvitation && (dressCodeMet && passwordIsCorrect);

        // Виводимо результати всіх трьох виразів на екран
        System.out.println(admitted);
        System.out.println(first);
        System.out.println(second);

    }
}