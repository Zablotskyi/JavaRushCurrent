package ua.javarush.java.core.level08.task13;

public class Solution {

    // Метод для скидання початкової точки траєкторії робота
    public static void resetRobotStart(int[] trajectoryPath) {
        // Встановлюємо перший елемент масиву рівним 0
        
    }

    public static void main(String[] args) {
        // Створюємо масив initialPath з початковими значеннями
        int[] initialPath = {3, 4, 5};

        // Викликаємо метод resetRobotStart, передаючи масив initialPath
        resetRobotStart(initialPath);

        // Виводимо значення першого елемента масиву initialPath
        System.out.println(initialPath[0]); // Очікуване виведення: 0
    }
}