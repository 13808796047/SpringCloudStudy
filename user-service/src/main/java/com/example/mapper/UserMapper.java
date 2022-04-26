package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Summer
 * @Since 2022/4/26 10:00 AM
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}