package com.example.bookdemo.service;

import com.example.bookdemo.dataAccess.BookDao;
import com.example.bookdemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{


    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao){
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAll() {
        return this.bookDao.findAll();
    }
}
