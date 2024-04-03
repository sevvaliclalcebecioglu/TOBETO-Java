package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
