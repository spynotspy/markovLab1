package bank.service.impl;

import bank.entity.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

class UserTest {
    @Test
    public void testUserCreation() {
        User user = new User("U001", "Иванов Иван", new Date(), "ИП Иванов", 6000, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 0);
        assertEquals("U001", user.getId());
        assertEquals("Иванов Иван", user.getFullName());
    }
}
