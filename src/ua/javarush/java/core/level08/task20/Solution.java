package ua.javarush.java.core.level08.task20;

public class Solution {
    public static void main(String[] args) {
        // Створюємо новий запис про учня
        SchoolStudent newPupil = new SchoolStudent();

        // Ім’я можна присвоїти напряму — поле публічне
        newPupil.studentName = "Марія";

        // Вік задається лише через публічний метод (інкапсуляція)
        newPupil.setStudentAge(16);

        // Виведемо акуратний профіль учня
        newPupil.displayStudentProfile();

        // Спроба прямої зміни приватного поля — це порушення інкапсуляції.
        newPupil.studentAge = 20;
    }
}

// Клас описує учня школи
class SchoolStudent {
    // Ім’я учня доступне всім — публічне поле
    public String studentName;

    // Вік учня — чутлива інформація, прихована від прямого доступу
    private int studentAge;

    // Публічний метод дозволяє коректно встановити вік
    public void setStudentAge(int ageToSet) {
        this.studentAge = ageToSet;
    }

    // Акуратно виводимо профіль учня
    public void displayStudentProfile() {
        System.out.println("Ім'я учня: " + this.studentName + ", Вік: " + this.studentAge);
    }
}