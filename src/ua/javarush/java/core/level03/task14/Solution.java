package ua.javarush.java.core.level03.task14;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо та ініціалізуємо змінні згідно з умовою задачі
        boolean ticketsOnSale = false;
        boolean haveMoneyForTicket = true;
        boolean concertNotCanceled = false;

        // Перший логічний вираз без додаткових дужок
        boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;

        // Другий логічний вираз із додаванням дужок
        boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;

        // Виводимо результати обох виразів на екран
        System.out.println(canBuy);
        System.out.println(canBuyWithNewMeaning);

    }
}