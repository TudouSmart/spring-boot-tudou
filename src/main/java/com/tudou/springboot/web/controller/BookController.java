package com.tudou.springboot.web.controller;

import com.tudou.springboot.db.mapper.BookMapper;
import com.tudou.springboot.web.TDataResp;
import com.tudou.springboot.web.TResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Resource
    private BookMapper bookMapper;

    @RequestMapping("/getById")
    public TResponse getById(Integer id) {
        return TDataResp.build(bookMapper.selectById(id));
    }
}
