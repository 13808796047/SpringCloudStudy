package com.example.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (UserBook)表实体类
 *
 * @author makejava
 * @since 2022-04-26 12:07:38
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_book")
public class UserBook  {
    @TableId
    private Integer id;

    
    private Integer userId;
    
    private Integer bookId;



}

