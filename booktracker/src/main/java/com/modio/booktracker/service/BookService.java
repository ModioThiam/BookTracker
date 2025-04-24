package com.modio.booktracker.service;

import com.modio.booktracker.entity.Book;
import com.modio.booktracker.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    // implementing methods for creating a book, and fetching all books
    public Book createBook(final Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

}
