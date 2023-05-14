package com.example.mockitotesting.DAO;

import com.example.mockitotesting.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Юзер_1"),
                new User("Юзер_2"),
                new User("Юзер_3"),
                new User("Юзер_4"),
                new User("Юзер_5")
        );
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public boolean checkUserExist(User user) {
        return users.contains(user);
    }
}
