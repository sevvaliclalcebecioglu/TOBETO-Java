package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
