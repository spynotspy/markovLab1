package bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Создает геттеры, сеттеры, toString, equals, hashCode и другие
@NoArgsConstructor // Генерирует конструктор без параметров
@AllArgsConstructor // Генерирует конструктор со всеми параметрами
public class BankAtm {
    private String id; // Идентификатор банкомата
    private String name; // Имя банкомата
    private String address; // Адрес, совпадающий с адресом банковского офиса
    private String status = "работает"; // Статус (по умолчанию работает)
    private Bank bank; // Банк, которому принадлежит банкомат
    private String location; // Расположение банкомата (адрес офисов банка)
    private String servicingEmployee; // Обслуживающий сотрудник
    public boolean canWithdraw; // Может ли банкомат выдавать деньги
    private boolean canDeposit; // Можно ли внести деньги
    private double amountOfMoney; // Кол-во денег в банкомате
    private double maintenanceCost; // Стоимость обслуживания банкомата
}
