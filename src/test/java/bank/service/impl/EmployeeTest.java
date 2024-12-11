package bank.service.impl;
import bank.entity.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class EmployeeTest {
    @Test
    public void testEmployeeCreation() {
        Bank bank = new Bank("B001", "Test Bank");
        Employee employee = new Employee("E001", "Сотрудник 1", new Date(), "Менеджер", bank, true, null, true, 5000);
        assertEquals("E001", employee.getId());
        assertEquals("Сотрудник 1", employee.getFullName());
    }
}
