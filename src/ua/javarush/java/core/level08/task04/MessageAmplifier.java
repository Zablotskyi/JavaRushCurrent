package ua.javarush.java.core.level08.task04;

public class MessageAmplifier {

    // Публічний статичний метод, що повторює рядок і виводить результат
    public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
        // Використовуємо звичайний рядок і оператор +
        String line = "";
        for (int i = 0; i < numberOfRepeats; i++) {
            line += messageText;
        }
        // Виводимо підсумковий «підсилений» рядок
        System.out.println(line);

    }

    public static void main(String[] args) {
        // Демонстрація роботи: підсилюємо повідомлення "Ура!" чотири рази
        amplifyAndDisplay("Ура!", 4);
    }
}