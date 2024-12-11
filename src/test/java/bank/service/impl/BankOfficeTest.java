package bank.service.impl;

import bank.entity.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankOfficeTest {
    @Test
    public void testBankOfficeCreation() {
        List<BankAtm> atmList = new ArrayList<>();
        BankOffice office = new BankOffice(
                "O001",            // id
                "Офис 1",         // name
                "Адрес 1",        // address
                "работает",       // status
                true,             // canPlaceAtm
                0,                // atmCount
                true,             // canIssueCredit
                true,             // canWithdraw
                true,             // canDeposit
                10000.0,         // amountOfMoney
                2000.0           // rentCost
        );

        assertEquals("O001", office.getId());
        assertEquals("Офис 1", office.getName());
    }
}
