package com.example.mockitotesting.DAO;

import com.example.mockitotesting.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();

    boolean checkUserExist(User user);
}
