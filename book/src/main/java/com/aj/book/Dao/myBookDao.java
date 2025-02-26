package com.aj.book.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.book.model.myBookList;

@Repository
public interface myBookDao extends JpaRepository<myBookList, Integer> {

}
