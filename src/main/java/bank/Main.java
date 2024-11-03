package bank;

import bank.entity.*;
import bank.service.impl.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Bank> banks = new ArrayList<>();
        Random random = new Random();

        // Создаем 5 банков
        for (int b = 1; b <= 5; b++) {
            Bank bank = new Bank("B" + b, "Банк " + b);
            banks.add(bank);

            // Создаем 3 банковских офиса для каждого банка
            for (int o = 1; o <= 3; o++) {
                BankOffice office = new BankOffice(
                        "O" + o + "B" + b,
                        "Офис " + o + " банка " + b,
                        "Улица " + random.nextInt(100), // Генерация случайного адреса
                        true,
                        true,
                        true,
                        true,
                        1500.00
                );

                bank.officeCount++;

                // Список сотрудников для этого офиса
                List<Employee> employees = new ArrayList<>();

                // Создаем 5 сотрудников в каждом офисе
                for (int e = 1; e <= 5; e++) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(1990 + random.nextInt(30), random.nextInt(12), random.nextInt(28)); // Случайная дата рождения
                    Date birthDate = calendar.getTime();
                    Employee employee = new Employee(
                            "E" + e + "B" + b,
                            "Сотрудник " + e,
                            birthDate,
                            "Менеджер",
                            bank,
                            false,
                            office,
                            true,
                            50000
                    );

                    employees.add(employee); // Добавляем сотрудника в список
                    // Вывод информации о сотруднике
                    System.out.println(employee);
                }

                // Создаем 5 клиентов для каждого офиса
                for (int c = 1; c <= 5; c++) {
                    User user = new User("U" + c + "B" + b, "Клиент " + c, new Date(), "Компания " + c);

                    // Использование случайного сотрудника для кредита
                    Employee employee = employees.get(random.nextInt(employees.size()));

                    // Создаем кредитный счет для каждого клиента
                    CreditAccount creditAccount = new CreditAccount(
                            "CA" + c + "B" + b,
                            user,
                            bank,
                            new Date(),
                            new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000), // Кредит на 1 год
                            12, // 12 месяцев
                            50000,
                            5.0,
                            employee,
                            "РQ1234567890"
                    );

                    user.getCreditAccounts().add(creditAccount);

                    // Создаем платежный счет для каждого клиента
                    PaymentAccount paymentAccount = new PaymentAccount("PA" + c + "B" + b, user, bank);
                    user.getPaymentAccounts().add(paymentAccount);

                    // Добавление клиента в банк
                    bank.clientCount++;

                    // Вывод информации о клиенте
                    System.out.println(user);
                }

                // Вывод информации о банковом офисе
                System.out.println(office);
            }

            // Вывод информации о банке
            System.out.println(bank);
        }
    }
}
