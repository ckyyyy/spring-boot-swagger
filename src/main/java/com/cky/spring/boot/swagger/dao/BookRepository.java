package com.cky.spring.boot.swagger.dao;

import com.cky.spring.boot.swagger.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}