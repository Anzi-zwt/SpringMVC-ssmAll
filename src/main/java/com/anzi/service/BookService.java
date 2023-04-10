package com.anzi.service;

import com.anzi.pojo.Books;

import java.util.List;

public interface BookService {
    int addBooks(Books book);

    int deleteBookById(int id);

    int updateBook(Books book);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
