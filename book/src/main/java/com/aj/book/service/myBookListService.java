package com.aj.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aj.book.Dao.myBookDao;
import com.aj.book.model.myBookList;
import java.util.*;


@Service
public class myBookListService {


    @Autowired
    private myBookDao mybookDao;

    public List<myBookList> getAllMyBookList() {
        return mybookDao.findAll();
    }

    public void savemyBook(myBookList book){
        mybookDao.save(book);
    }

    public void deleteById(int id){
        mybookDao.deleteById(id);
    }
}
