package com.evgeniy.dao;

import com.evgeniy.model.User;

import java.util.List;

public class UserDao {

    public List<User> findAll() {
        return List.of(
                new User(13, "Ivan"),
                new User(22, "Evgeniy"),
                new User(18, "Nina")
        );
    }
}
