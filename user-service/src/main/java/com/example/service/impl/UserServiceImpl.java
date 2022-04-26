package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Summer
 * @Since 2022/4/26 10:01 AM
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Resource
    UserMapper mapper;


    @Override
    public User getUserById(Integer id) {
        return mapper.selectById(id);
    }
}