package com.anzi.mapper;

import com.anzi.pojo.Books;

import java.util.List;


public interface BookMapper {
    int addBooks(Books book);

    int deleteBookById(int id);

    int updateBook(Books book);

    Books queryBookById(int id);

    List<Books> queryAllBook();


}
