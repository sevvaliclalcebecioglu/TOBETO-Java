package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
