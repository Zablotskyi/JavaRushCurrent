package ua.javarush.java.core.level07.task11;

public class Solution {
    public static void main(String[] args) {
        // Створюємо двовимірний масив розміром 3 рядки і 4 стовпці
int[][] warehouseInventory = new int[3][4];

        // Змінна для заповнення масиву числами від 1 до 12
        int value = 1;

        // Вкладені цикли для заповнення масиву
        // Проходимо по рядках
        for (int i = 0; i < warehouseInventory.length; i++) {
            // Проходимо по стовпцях
            for (int j = 0; j < warehouseInventory[i].length; j++) {
                // Заповнюємо поточну комірку
                warehouseInventory[i][j] = value;
                // Збільшуємо число для наступної комірки
                value++;
            }
        }

        // Виведення значення з другого рядка і третього стовпця
        // Індекси в масиві починаються з 0, тому другий рядок — це індекс 1, третій стовпець — це індекс 2
        System.out.println(warehouseInventory[1][2]);
    }
}