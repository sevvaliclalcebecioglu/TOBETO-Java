package com.tobeto.kitap.satis.repositories;

import com.tobeto.kitap.satis.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
}
