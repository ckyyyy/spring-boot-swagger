package com.cky.spring.boot.swagger.controller;

import com.cky.spring.boot.swagger.model.Book;
import com.cky.spring.boot.swagger.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public String sveBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("/searchBook/{bookId}")
    public  Book getBook(@PathVariable int bookId)
    {
        return bookService.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public List<Book> deleteBook(int bookId) {
        return bookService.removeBook(bookId);
    }

}
