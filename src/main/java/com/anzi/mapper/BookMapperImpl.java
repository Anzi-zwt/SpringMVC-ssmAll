package com.anzi.mapper;

import com.anzi.pojo.Books;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper{
    private SqlSession sqlSession;
    private BookMapper bookMapper;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {

        super.setSqlSessionFactory(sqlSessionFactory);
        sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }

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
