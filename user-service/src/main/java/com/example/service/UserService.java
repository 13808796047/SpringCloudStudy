package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.User;

/**
 * @Author Summer
 * @Since 2022/4/26 10:00 AM
 * @Version 1.0
 */
public interface UserService extends IService<User> {
    User getUserById(Integer id);
}
