package com.example.demo1.service.impl;

import com.example.demo1.domain.User;
import com.example.demo1.mapper.userMapper;
import com.example.demo1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {


    @Autowired
    private userMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        userMapper.deleteBatch(ids);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateById(Integer id, User user) {
        userMapper.updateById(id, user);
    }
}
