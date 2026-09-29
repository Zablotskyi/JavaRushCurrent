package ua.javarush.java.core.level06.task19;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо змінну типу int і присвоюємо їй значення 200
        int currentCityTemperature = 200;

        // Явно приводимо значення змінної currentCityTemperature до типу byte
        byte sensorReading = (byte) currentCityTemperature;

        // Виводимо результат на екран
        System.out.println(sensorReading);
    }
}