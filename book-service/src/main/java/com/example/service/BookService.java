package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Book;


/**
 * (Book)表服务接口
 *
 * @author makejava
 * @since 2022-04-26 11:33:35
 */
public interface BookService extends IService<Book> {

    Book get(Integer id);
}

