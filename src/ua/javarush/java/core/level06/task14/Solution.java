package ua.javarush.java.core.level06.task14;

public class Solution {
    public static void main(String[] args) {
        // Початкова ціна еліксиру з податком
        double elixirPriceWithTax = 17.34567;

        // Округлюємо до двох знаків після коми:
        // Множимо на 100, округлюємо за допомогою Math.round, потім ділимо на 100.0
        double displayPrice = Math.round(elixirPriceWithTax * 100) / 100.0;

        // Виводимо округлену ціну на екран
        System.out.println(displayPrice);
    }
}