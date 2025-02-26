package com.aj.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.aj.book.model.Book;
import com.aj.book.Dao.BookDao;

@Service
public class BookService {



    @Autowired
    private BookDao bookDao;
    
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }
    
    public void save(Book b){
        bookDao.save(b);
    }


    public Book getBookById(int id){
        return bookDao.findById(id).get();
    }

    public void deleteById(int id){
        bookDao.deleteById(id);
    }
}
