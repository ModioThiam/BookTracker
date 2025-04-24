package com.modio.booktracker.controller;

import com.modio.booktracker.entity.Book;
import com.modio.booktracker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// spring annotation telling Spring Boot that this class handles HTTP requests and returns data (JSON), not HTML views.
@RestController
// defines base URL for controller's endpoints
@RequestMapping("/api/v1/books")
// handles incoming requests
// endpoint that will be called
public class BookController {

    @Autowired
    private BookService bookService;

    // creates a book (POST)
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    // gets all books (GET)
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
