package com.anzi.controller;


import com.anzi.pojo.Books;
import com.anzi.service.BookService;
import com.anzi.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/book")
//@ResponseBody
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookServiceImpl bookService;

    @RequestMapping("/quaryAll")
    public String quaryAll(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "quaryAllBooks";
    }

    @RequestMapping("/addBook")
    public String addBooks(Books book){
        bookService.addBooks(book);
        return "redirect:/book/quaryAll";
    }

}
