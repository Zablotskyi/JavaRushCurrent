package ua.javarush.java.core.level03.task16;

public class Solution {
    public static void main(String[] args) {
        // Початкові дані
        int yourAge = 25;
        boolean hasJob = true;
        boolean hasCreditHistory = false;
        boolean hasGuarantor = true;

        // Кредит схвалять, якщо (вік > 21 і є робота) АБО (є кредитна історія і поручитель)
        boolean firstRule = (yourAge > 21 && hasJob == true) || (hasCreditHistory == true && hasGuarantor == true);

        // Кредит схвалять, якщо (вік > 21) І (є робота АБО кредитна історія) І (є поручитель)
        boolean secondRule = (yourAge > 21 && (hasJob == true || hasCreditHistory == true) && hasGuarantor == true);

        // Виводимо результати за двома правилами
        System.out.println(firstRule);
        System.out.println(secondRule);

    }
}