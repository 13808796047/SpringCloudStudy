package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Author Summer
 * @Since 2022/4/26 12:28 PM
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class BorrowDetail {
    User user;
    List<Book> bookList;
}
