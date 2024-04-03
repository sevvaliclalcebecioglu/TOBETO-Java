package com.tobeto.kitap.satis.repositories;


import com.tobeto.kitap.satis.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
