package ua.javarush.java.core.level07.task12;

public class Solution {
    public static void main(String[] args) {
        // Створюємо двовимірний масив для зберігання показників (2 рядки, 5 стовпців)
        int[][] sensorData = new int[2][5];
        // Початкове значення для заповнення масиву
        int value = 10;

        // Заповнюємо масив по рядках, зліва направо
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                sensorData[i][j] = value;
                value++;
            }
        }

        // Виводимо масив у вигляді таблиці
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                System.out.print(sensorData[i][j]);
                if (j != sensorData[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Друкуємо значення елемента

        // Якщо це не останній елемент у рядку, додаємо пробіл


        // Після кожного рядка переходимо на новий


    }
}