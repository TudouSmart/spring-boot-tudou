package com.tudou.springboot.db.mapper;

import com.tudou.springboot.db.dao.BookDO;

import java.util.List;

public interface BookMapper {

    int insert(BookDO bookDO);

    BookDO selectById(int id);

    List<BookDO> selectByAuthor(String author);
}
