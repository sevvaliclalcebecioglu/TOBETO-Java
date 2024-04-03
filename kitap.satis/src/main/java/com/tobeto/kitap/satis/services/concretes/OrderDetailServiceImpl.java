package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.services.abstracts.OrderDetailService;
import com.tobeto.kitap.satis.services.dtos.requests.AddOrderDetailRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderDetailRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    @Override
    public AddOrderDetailResponse add(AddOrderDetailRequest request) {
        return null;
    }

    @Override
    public UpdateOrderDetailResponse update(UpdateOrderDetailRequest request) {
        return null;
    }

    @Override
    public DeleteOrderDetailResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListOrderDetailResponse> getAll() {
        return null;
    }

    @Override
    public GetOrderDetailResponse getById(int id) {
        return null;
    }
}
