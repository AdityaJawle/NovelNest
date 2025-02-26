package com.aj.book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aj.book.service.BookService;
import com.aj.book.service.myBookListService;
import com.aj.book.model.Book;
import com.aj.book.model.myBookList;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class BookController {


    @Autowired
    private final BookService bookService;


    @Autowired
    private myBookListService mybookService;

    BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/bk_register")
    public String bkRegister() {
        return "bkRegister";
    }

    @GetMapping("avail_bk")
    public ModelAndView getAllBook() {
        List<Book>list = bookService.getAllBooks();
        // ModelAndView model = new ModelAndView();
        // model.setViewName("bookList");
        // model.addObject(book, list);
        return new ModelAndView("bookList", "book", list);
    }
    

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        bookService.save(b);
        return "redirect:/avail_bk";
    
    }

    @GetMapping("/m_book")
    public String getMyBook(Model model) {
        List<myBookList>list = mybookService.getAllMyBookList();
        model.addAttribute("book", list);    
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMylist(@PathVariable("id") int id){
        Book b= bookService.getBookById(id);
        myBookList mb = new myBookList(b.getId(), b.getBname(), b.getAuthor(), b.getPrice());
        mybookService.savemyBook(mb);
        return "redirect:/m_book";
    }
    
    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Book b=bookService.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @RequestMapping("/deleteMybook/{id}")
    public String deleteMybook(@PathVariable("id") int id) {
        bookService.deleteById(id);
        return "redirect:/avail_bk";
    }
    
    
}
