package bank;

import bank.entity.*;
import bank.exception.*;
import bank.service.impl.CreditService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список банков
        List<Bank> banks = new ArrayList<>();

        // Создаем банки и добавляем их в список
        for (int i = 1; i <= 3; i++) {
            Bank bank = new Bank(
                    "B" + i,
                    "Банк " + i
            );
            banks.add(bank);
        }

        // Создаем пользователей
        User user = new User("U001", "Иванов Иван", new Date(), "ИП Иванов", 6000, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 0);

        // Создаем офисы и банкоматы для каждого банка
        for (Bank bank : banks) {
            // Создаем офисы
            List<BankOffice> offices = new ArrayList<>();
            for (int j = 1; j <= 2; j++) { // Пример: 2 офиса
                BankOffice office = new BankOffice(
                        "O" + j,
                        "Офис " + j,
                        "Адрес Офиса " + j,
                        "работает",
                        true, // Может размещать банкоматы
                        0, // Начальное количество банкоматов
                        true, // Может выдавать кредиты
                        true, // Можно снимать деньги
                        true, // Можно вносить деньги
                        1500.00, // Количество денег в офисе
                        0, // Стоимость аренды
                        new ArrayList<>(),
                        new ArrayList<>()
                );
                offices.add(office);

                // Создаем банкоматы для этого офиса
                for (int k = 1; k <= 5; k++) { // Пример: 5 банкоматов
                    BankAtm atm = new BankAtm(
                            "ATM" + k + "_" + j,
                            "Банкомат " + k + " в офисе " + j,
                            "Адрес банкомата " + k + " в офисе " + j,
                            "работает",
                            bank,
                            "Расположение банкомата",
                            "Сотрудник " + k,
                            true,
                            true,
                            100000.00,
                            200.00
                    );
                    office.getAtmList().add(atm);
                }
            }
            bank.setOffices(offices); // Устанавливаем офисы в банке
        }

        // Запрашиваем кредит
        try {
            double requestedAmount = 10000; // Запрашиваемая сумма кредита
            CreditService.requestCredit(user, banks, requestedAmount);
        } catch (CreditRequestException e) {
            System.err.println("Ошибка при получении кредита: " + e.getMessage());
        }

        // Вывод информации о пользователе и его кредитах
        System.out.println("Пользователь: " + user);
        System.out.println("Кредиты пользователя: " + user.getCreditAccounts());
    }
}
