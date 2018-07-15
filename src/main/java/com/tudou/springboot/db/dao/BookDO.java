package com.tudou.springboot.db.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BookDO {

    private int id;

    private String bookName;

    private LocalDateTime publicationDate;

    private String author;

    private String desc;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
