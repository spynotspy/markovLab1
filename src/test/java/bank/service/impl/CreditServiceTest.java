package bank.service.impl;

import bank.entity.*;
import bank.exception.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CreditServiceTest {

    private User user;
    private Bank bank;
    private BankOffice office;

    @BeforeEach
    public void setUp() {
        user = new User("U001", "Иванов Иван", new Date(), "ИП Иванов", 6000, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 0);
        bank = new Bank("B001", "Test Bank");


        BankOffice office = new BankOffice("O001", "Офис 1", "Адрес 1", "работает", true, 0, true, true, true, 10000, 0);
        bank.setOffices(List.of(office)); // правильное добавление офиса
        user.getPaymentAccounts().add(new PaymentAccount("PA001", user, bank, 0));
    }


    @org.junit.Test
    @Test
    public void testRequestCredit_Success() throws CreditRequestException {

        assertNotNull(user);
        assertNotNull(bank);

        CreditService.requestCredit(user, List.of(bank), 5000);
        assertEquals(1, user.getCreditAccounts().size());
    }


}
