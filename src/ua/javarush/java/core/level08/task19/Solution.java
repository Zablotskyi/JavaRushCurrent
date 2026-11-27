package ua.javarush.java.core.level08.task19;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт класу FactoryBox
        FactoryBox productBox = new FactoryBox();

        // Встановлюємо розмір коробки за допомогою методу setDimensions
        productBox.setDimensions(10);

        // Виводимо на екран поточний розмір коробки
        System.out.println(productBox.boxSize);
    }
}

class FactoryBox {
    // Публічне поле для зберігання розміру коробки
    public int boxSize;

    // Публічний метод для встановлення розміру коробки
    public void setDimensions(int boxSize) {
        // Використовуємо ключове слово this, щоб вказати, що змінюємо поле класу
        this.boxSize = boxSize;
    }
}