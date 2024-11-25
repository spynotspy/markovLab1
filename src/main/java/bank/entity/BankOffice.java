package bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data // Генерирует геттеры, сеттеры и другие методы
@NoArgsConstructor // Конструктор без параметров
@AllArgsConstructor // Конструктор со всеми параметрами
public class BankOffice {
    private String id; // Идентификатор
    private String name; // Имя
    private String address; // Адрес
    private String status; // Статус
    private boolean canPlaceAtm; // Может ли разместить банкомат
    private int atmCount; // Количество банкоматов
    public boolean canIssueCredit; // Может ли выдавать кредиты
    private boolean canWithdraw; // Можно ли снимать деньги
    private boolean canDeposit; // Можно ли вносить деньги
    private double amountOfMoney; // Количество денег
    private double rentCost; // Стоимость аренды

    private List<BankAtm> atmList = new ArrayList<>(); // Список банкоматов


    // Ломбок с аннотацией @Data автоматически создает геттер
    @Getter
    private List<Employee> employeeList = new ArrayList<>();





}
