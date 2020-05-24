package com.cky.spring.boot.swagger.controller;

import com.cky.spring.boot.swagger.model.Book;
import com.cky.spring.boot.swagger.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@Api(value="Book Service", description = "My Book Store")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    @ApiOperation(value= "Store book API")
    public String sveBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("/searchBook/{bookId}")
    @ApiOperation(value= "Get book by ID API")
    public  Book getBook(@PathVariable int bookId)
    {
        return bookService.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    @ApiOperation(value= "Delete book bi ID API")
    public List<Book> deleteBook(@PathVariable int bookId) {
        return bookService.removeBook(bookId);
    }

}
