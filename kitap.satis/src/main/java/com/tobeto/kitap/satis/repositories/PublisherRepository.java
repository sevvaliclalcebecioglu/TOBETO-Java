package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
