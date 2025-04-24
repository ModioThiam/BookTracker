package com.modio.booktracker.repository;

import com.modio.booktracker.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

// Long = ID (primary key) for book (entity).
// Spring automatically generates basic database methods, save(), findAll(), findById(), deleteById()
// BookRepository inherits behavior/methods from JpaRepository.
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
