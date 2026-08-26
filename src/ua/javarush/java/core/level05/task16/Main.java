package ua.javarush.java.core.level05.task16;

// Імпортуємо клас
import java.util.Date;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Створюємо об’єкт java.util.Date і присвоюємо йому поточні дату і час
        java.util.Date date = new java.util.Date();
        date.setTime(System.currentTimeMillis());

        // Створюємо об’єкт java.sql.Date, використовуючи повну назву класу, і присвоюємо йому поточну дату
        java.sql.Date dateSQL = new java.sql.Date(System.currentTimeMillis());
        dateSQL.setTime(System.currentTimeMillis());

        // Виводимо обидва об’єкти у консоль
        System.out.println(date);
        System.out.println(dateSQL);
    }
}