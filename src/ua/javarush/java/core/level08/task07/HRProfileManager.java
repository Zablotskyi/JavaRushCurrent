package ua.javarush.java.core.level08.task07;

public class HRProfileManager {
    // Статичний метод приймає ім’я та вік співробітника,
    // формує рядок картки та виводить його на екран
    public static void displayEmployeeCard(String employeeName, int employeeAge) {
        System.out.println("Ім’я співробітника: " + employeeName + ", Вік: " + employeeAge);
    }

    public static void main(String[] args) {
        // Перевіряємо роботу методу на прикладі
        displayEmployeeCard("Олег", 30);
    }
}