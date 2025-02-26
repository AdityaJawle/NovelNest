package com.aj.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aj.book.service.myBookListService;


@Controller
public class myBookController {



    @Autowired
    private myBookListService mybookService;




    @RequestMapping("/deleteMylist/{id}")
    public String deleteMylist(@PathVariable("id") int id) {
        mybookService.deleteById(id);
        return "redirect:/m_book";
    }
}
