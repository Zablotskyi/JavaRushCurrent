package ua.javarush.java.core.level08.task17;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт класу VillageResident
        VillageResident newVillager = new VillageResident();

        // Безпосередньо присвоюємо значення "Іван" полю residentName
        newVillager.residentName = "Іван";

        // Виводимо значення поля residentName на екран
        System.out.println(newVillager.residentName);
    }
}

