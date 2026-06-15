package ua.javarush.java.core.level03.task11;

public class Solution {
    public static void main(String[] args) {
        // Початкові умови (можна змінювати для перевірки різних варіантів)
        boolean isSunny = true;
        boolean isWeekend = true;
        boolean canGoToPark = false;
        boolean canStayHome = false;

        // До парку йдемо лише якщо водночас сонячно Й вихідні
        if (isSunny == true && isWeekend == true) {
            canGoToPark = true;
        }

        // Залишаємось удома, якщо НЕ сонячно АБО НЕ вихідні
        if (!isSunny || !isWeekend) {
            canStayHome = true;
        }

        // Виведення значень на екран
        System.out.println(canGoToPark);
        System.out.println(canStayHome);

    }
}