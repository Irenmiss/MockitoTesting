package com.example.mockitotesting;

import com.example.mockitotesting.DAO.UserDao;
import com.example.mockitotesting.model.User;
import com.example.mockitotesting.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void shouldCheckUserIfExistTrue() {
        when(userDao.getUserByName("test")).thenReturn(new User("test"));
        boolean userExists = userService.checkUserExist(new User("test"));
        verify(userDao, times(1)).getUserByName("test");
        assertTrue(userExists);
    }

    @Test
    public void shouldCheckIfUserExistFalse() {
        when(userDao.getUserByName("test")).thenReturn(null);
        boolean userExists = userService.checkUserExist(new User("test"));
        assertFalse(userExists);
    }
}
