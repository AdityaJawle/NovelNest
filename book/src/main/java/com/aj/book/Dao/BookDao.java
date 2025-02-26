package com.aj.book.Dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aj.book.model.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer>{

}
