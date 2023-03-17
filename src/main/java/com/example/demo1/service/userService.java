package com.example.demo1.service;

import com.example.demo1.domain.User;

import java.util.List;

public interface userService {
    List<User> findAll();

    void insert(User user);

    void deleteBatch(Integer[] ids);

    User findById(Integer id);

    void deleteById(Integer id);

    void updateById(Integer id, User user);
}
