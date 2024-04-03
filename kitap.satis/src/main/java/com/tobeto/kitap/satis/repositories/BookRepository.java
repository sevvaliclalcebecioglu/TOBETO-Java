package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Optional<Book> findByIsbn(Integer isbn);
}
