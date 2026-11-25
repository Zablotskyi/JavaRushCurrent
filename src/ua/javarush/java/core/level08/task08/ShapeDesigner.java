package ua.javarush.java.core.level08.task08;

public class ShapeDesigner {

    // Статичний метод, який виводить характеристики прямокутника
    public static void printRectangleSpecs(int rectangleWidth, int rectangleHeight) {
        System.out.println("Характеристики прямокутника: ширина = " + rectangleWidth + ", висота = " + rectangleHeight);
    }

    public static void main(String[] args) {
        // Демонстрація роботи методу з трьома наборами параметрів
        printRectangleSpecs(5, 10);
        printRectangleSpecs(3, 7);
        printRectangleSpecs(12, 4);
    }
}