package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.BorrowDetail;
import com.example.entity.UserBook;

import java.io.Serializable;


/**
 * (UserBook)表服务接口
 *
 * @author makejava
 * @since 2022-04-26 12:07:38
 */
public interface UserBookService extends IService<UserBook> {

    BorrowDetail getUserBorrowDetail(Serializable uid);
}

