package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Book;
import org.apache.ibatis.annotations.Mapper;


/**
 * (Book)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-26 11:34:19
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
