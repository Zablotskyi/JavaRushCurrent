package ua.javarush.java.core.level05.task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для читання числа з клавіатури
        Scanner console = new Scanner(System.in);
        int secretKeyCandidate = console.nextInt();

        // Числа <= 1 не є простими
        if (secretKeyCandidate <= 1) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;

        // Перевіряємо дільники від 2 до sqrt(n).
        // Умова i <= n / i еквівалентна i*i <= n, але без ризику переповнення int.
        for (/* ініціалізація */; /* умова */; /* зміна */) {
            if (/* умова */) { // Знайшли дільник — число складене

                break;
            }
        }

        // Виводимо результат перевірки

    }
}