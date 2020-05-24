package com.cky.spring.boot.swagger.service;

import com.cky.spring.boot.swagger.dao.BookRepository;
import com.cky.spring.boot.swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public String save(Book book) {
        bookRepository.save(book);
        return "Book saved with id " + book.getBookId();
    }

    public Book getBook(int bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public List<Book> removeBook(int bookId) {
        bookRepository.deleteById(bookId);
        return bookRepository.findAll();
    }
}
