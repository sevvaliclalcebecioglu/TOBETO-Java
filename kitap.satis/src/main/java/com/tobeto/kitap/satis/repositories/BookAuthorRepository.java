package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor,Integer> {
}
