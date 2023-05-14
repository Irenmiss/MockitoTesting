package com.example.mockitotesting.service;

import com.example.mockitotesting.DAO.UserDao;
import com.example.mockitotesting.model.User;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}
