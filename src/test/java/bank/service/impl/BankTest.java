package bank.service.impl;

import bank.entity.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class BankTest {
    @Test
    public void testBankCreation() {
        Bank bank = new Bank("B001", "Test Bank");
        bank.setOffices(new ArrayList<>());  // Добавить офисы
        assertEquals("B001", bank.getId());
        assertEquals(0, bank.getOfficeCount());
    }
}
