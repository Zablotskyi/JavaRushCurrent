package ua.javarush.java.core.level03.task03;

public class Solution {
    public static void main(String[] args) {
        // Оголоси змінну userPassword і присвой їй значення "qwerty"
        String userPassword = "qwerty";

        // Перевір, чи збігається пароль із очікуваним значенням "qwerty"
        if (userPassword.equals("qwerty")) {
            // Якщо умова істинна, виведи повідомлення про успішний вхід
            System.out.println("Вхід виконано успішно");
        }
        // Якщо пароль не збігається, блок else не використовується і програма нічого не виводить
    }
}