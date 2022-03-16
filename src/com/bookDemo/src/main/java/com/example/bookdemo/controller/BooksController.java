package com.example.bookdemo.controller;

import com.example.bookdemo.model.Book;
import com.example.bookdemo.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    private BookService bookService;

    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("getall")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

}
