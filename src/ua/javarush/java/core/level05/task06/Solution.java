package ua.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для читання рядка з клавіатури
        Scanner scanner = new Scanner(System.in);
        String ancientRiddle = scanner.nextLine();
        String tempAncientRiddle = "";

        // Перевіряємо паліндром двома вказівниками: з початку і з кінця
        boolean flag = true;

        for (int i = ancientRiddle.length() - 1, j = 0; i >= 0; i--, j++) {
            // Перевірка чутлива до регістру, порівнюємо символи напряму
            if (ancientRiddle.charAt(i) != ancientRiddle.charAt(j)) {
                flag = false;
                break; // Далі перевіряти не потрібно
            }

        }

        // Вивід суворо "YES" або "NO" без додаткових повідомлень
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}