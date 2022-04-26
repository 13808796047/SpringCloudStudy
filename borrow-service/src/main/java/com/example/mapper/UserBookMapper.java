package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.UserBook;
import org.apache.ibatis.annotations.Mapper;


/**
 * (UserBook)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-26 12:07:37
 */
@Mapper
public interface UserBookMapper extends BaseMapper<UserBook> {

}
