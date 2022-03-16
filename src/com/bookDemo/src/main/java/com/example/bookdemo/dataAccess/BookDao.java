package com.example.bookdemo.dataAccess;

import com.example.bookdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookDao extends JpaRepository<Book,Integer> {



}
