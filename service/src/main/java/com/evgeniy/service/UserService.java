package com.evgeniy.service;

import com.evgeniy.dao.UserDao;
import com.evgeniy.model.User;

import java.util.List;

public class UserService {


    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
