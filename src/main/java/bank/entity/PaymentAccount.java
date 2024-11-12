package bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class PaymentAccount {
    private String id;
    private User user;
    private Bank bank;
    private double balance = 0.0; // Начальный баланс по умолчанию 0
}
