package com.anzi.service;

import com.anzi.mapper.BookMapper;
import com.anzi.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }


    @Override
    public int addBooks(Books book){
        return bookMapper.addBooks(book);
    }

    public int deleteBookById(int id){
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books book){
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int id){
        return bookMapper.queryBookById(id);
    }


    public List<Books> queryAllBook(){
        return bookMapper.queryAllBook();
    }
}
