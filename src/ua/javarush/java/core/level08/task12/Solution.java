package ua.javarush.java.core.level08.task12;

public class Solution {

    // Метод із поверненим значенням int: приймає масив оцінок і повертає їхню суму
    public static int calculateTotalGrades(int[] studentExamResults) {
        int sum = 0;
        // Проходимо всі елементи масиву та накопичуємо суму
        for (int item : studentExamResults) {
            sum += item;
        }
        // Повертаємо підсумкову суму
        return sum;
    }

    public static void main(String[] args) {
        // Віртуальний список оцінок студента
        int[] currentGrades = {5, 4, 3, 5, 4};

        // Викликаємо метод підрахунку та зберігаємо результат у змінну finalTotalPoints
        int finalTotalPoints = calculateTotalGrades(currentGrades);

        // Виводимо результат на екран
        System.out.println("Сума всіх оцінок: " + finalTotalPoints);
    }
}