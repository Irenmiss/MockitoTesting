package com.example.mockitotesting;

import com.example.mockitotesting.DAO.UserDaoImpl;
import com.example.mockitotesting.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    private final UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test
    public void shouldFindUserByName() {
        User user = userDaoImpl.getUserByName("Юзер_1");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(), "Юзер_1");
    }

    @Test
    public void shouldReturnNullIfUserNotExists() {
        Assertions.assertNull(userDaoImpl.getUserByName("Юзер_100"));
    }
}
