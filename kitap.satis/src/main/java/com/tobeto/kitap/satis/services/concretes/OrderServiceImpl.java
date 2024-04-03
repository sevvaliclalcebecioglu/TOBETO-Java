package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.services.abstracts.OrderService;
import com.tobeto.kitap.satis.services.dtos.requests.AddOrderRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public AddOrderResponse add(AddOrderRequest request) {
        return null;
    }

    @Override
    public UpdateOrderResponse update(UpdateOrderRequest request) {
        return null;
    }

    @Override
    public DeleteOrderResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListOrderResponse> getAll() {
        return null;
    }

    @Override
    public GetOrderResponse getById(int id) {
        return null;
    }
}
