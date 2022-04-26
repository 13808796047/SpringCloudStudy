package com.example.controller;

import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author Summer
 * @Since 2022/4/26 11:27 AM
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BooKController {
    @Resource
    BookService bookService;
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookService.get(id);
    }
}
