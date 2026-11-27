package ua.javarush.java.core.level08.task18;

// Головний офіс банку з методом main
public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт класу CustomerBankAccount з іменем myPrivateAccount
        CustomerBankAccount myPrivateAccount = new CustomerBankAccount();

        // Поповнюємо баланс лише через публічний метод
        myPrivateAccount.depositMoney(1000);

        // Спроба прямого доступу до приватного поля ззовні класу:
        myPrivateAccount.accountBalance = 2000;
    }
}

// Клас надсекретного банківського рахунку клієнта
class CustomerBankAccount {
    // Приватне поле — до нього не можна звертатися напряму з інших класів
    private int accountBalance;

    // Публічний метод для контрольованого поповнення рахунку
    public void depositMoney(int amountToDeposit) {
        // Збільшуємо баланс на вказану суму
        accountBalance += amountToDeposit;
    }
}