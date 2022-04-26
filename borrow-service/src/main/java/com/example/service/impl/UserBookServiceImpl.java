package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Book;
import com.example.entity.BorrowDetail;
import com.example.entity.User;
import com.example.entity.UserBook;
import com.example.mapper.UserBookMapper;
import com.example.service.UserBookService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (UserBook)表服务实现类
 *
 * @author makejava
 * @since 2022-04-26 12:07:38
 */
@Service("userBookService")
public class UserBookServiceImpl extends ServiceImpl<UserBookMapper, UserBook> implements UserBookService {

    @Resource
    UserBookMapper userBookMapper;

    @Override
    public BorrowDetail getUserBorrowDetail(Serializable uid) {
        LambdaQueryWrapper<UserBook> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserBook::getUserId,uid);
        List<UserBook> borrows = userBookMapper.selectList(queryWrapper);
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://127.0.0.1:8080/users/" + uid, User.class);
        List<Book> books = borrows
                .stream()
                .map(borrow -> restTemplate.getForObject("http://127.0.0.1:8083/books/" + borrow.getBookId(), Book.class))
                .collect(Collectors.toList());
        return new BorrowDetail(user,books);
    }
}
