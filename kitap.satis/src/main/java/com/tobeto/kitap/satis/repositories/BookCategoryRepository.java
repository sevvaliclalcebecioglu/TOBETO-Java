package com.tobeto.kitap.satis.repositories;


import com.tobeto.kitap.satis.entities.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Integer> {
}
