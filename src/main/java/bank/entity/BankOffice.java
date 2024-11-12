package bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class BankOffice {
    private String id;
    private String name;
    private String address;
    private String status = "работает"; // По умолчанию офис работает
    private boolean canPlaceAtm;
    private int atmCount = 0; // Начальное значение количества банкоматов
    private boolean canIssueCredit;
    private boolean canWithdraw;
    private boolean canDeposit;
    private double amountOfMoney = 0; // Начальное значение денег в офисе
    private double rentCost;

    // Если потребуется, добавьте дополнительные методы или логику
}
