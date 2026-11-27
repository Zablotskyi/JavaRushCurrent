package ua.javarush.java.core.level08.task16;

// Клас MagicalContainer представляє чарівну скриньку з магічним значенням
class MagicalContainer {
    // Публічне поле magicValue для зберігання магічного значення
    public int magicValue;
}

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт класу MagicalContainer і присвоюємо його змінній myTreasureChest
        MagicalContainer myTreasureChest = new MagicalContainer();
        
        // Ініціалізуємо поле magicValue значенням 15
        myTreasureChest.magicValue = 15;

        // Викликаємо метод attemptToEnchantContainer з об’єктом myTreasureChest
        attemptToEnchantContainer(myTreasureChest);

        // Виводимо значення magicValue об’єкта myTreasureChest на екран
        // Очікуване значення: 99
        System.out.println(myTreasureChest.magicValue);
    }

    // Метод attemptToEnchantContainer намагається змінити магічне значення і замінити об’єкт
    public static void attemptToEnchantContainer(MagicalContainer container) {
        // Змінюємо значення magicValue переданого об’єкта на 99


        // Намагаємося замінити об’єкт на новий із magicValue, що дорівнює 42

    }
}