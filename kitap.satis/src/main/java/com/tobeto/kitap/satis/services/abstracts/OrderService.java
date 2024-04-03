package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddOrderRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface OrderService
{
    AddOrderResponse add(AddOrderRequest request);
    UpdateOrderResponse update(UpdateOrderRequest request);
    DeleteOrderResponse delete(int id);
    List<ListOrderResponse> getAll();
    GetOrderResponse getById(int id);
}
