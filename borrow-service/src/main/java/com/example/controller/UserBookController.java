package com.example.controller;




import com.example.entity.BorrowDetail;
import com.example.entity.UserBook;
import com.example.service.UserBookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * (UserBook)表控制层
 *
 * @author makejava
 * @since 2022-04-26 12:07:36
 */
@RestController
@RequestMapping("/borrows")
public class UserBookController{
    /**
     * 服务对象
     */
    @Resource
    private UserBookService userBookService;


    @GetMapping("/{uid}")
    public BorrowDetail selectOne(@PathVariable Serializable uid) {
        return this.userBookService.getUserBorrowDetail(uid);
    }


}

