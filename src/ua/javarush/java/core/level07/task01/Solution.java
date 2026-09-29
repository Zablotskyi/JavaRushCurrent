package ua.javarush.java.core.level07.task01;

public class Solution {
    public static void main(String[] args) {
        // Оголошуємо масив на 5 цілих чисел — це наш "наплічник"
        int[] inventorySlots = new int[5];

        // Кладемо артефакт (число 7) у першу комірку масиву (індекс 0)
        inventorySlots[0] = 7;

        // Виводимо значення з першої комірки, щоб упевнитися, що артефакт на місці
        System.out.println(inventorySlots[0]);
    }
}