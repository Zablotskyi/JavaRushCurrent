package ua.javarush.java.core.level06.task08;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо загальну кількість магічних яблук
        int totalApples = 7;

        // Оголошуємо кількість друзів-авантюристів
        int numberOfFriends = 2;

        // Приводимо totalApples до типу double перед діленням, щоб зберегти дробову частину результату
        double applesPerFriend = (double) totalApples / numberOfFriends;

        // Виводимо на екран точну частку яблук на одного друга (з дробовою частиною)
        System.out.println(applesPerFriend);
    }
}