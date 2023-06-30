package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //create
    @PostMapping
    public Book create(@RequestBody Book book){
    return  this.bookService.create(book);
    }

    // get all
    @GetMapping
    public List<Book> getAll(){
        return  this.bookService.getAll();
    }

    //get single book
    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable int bookId){
        return  this.bookService.get(bookId);
    }
}
