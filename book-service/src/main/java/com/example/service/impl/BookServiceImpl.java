package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Book)表服务实现类
 *
 * @author makejava
 * @since 2022-04-26 11:33:37
 */
@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Resource
    BookMapper bookMapper;
    @Override
    public Book get(Integer id) {
        return bookMapper.selectById(id);
    }
}
