package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddOrderDetailRequest;
import com.tobeto.kitap.satis.services.dtos.requests.AddOrderRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderDetailRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface OrderDetailService
{
    AddOrderDetailResponse add(AddOrderDetailRequest request);
    UpdateOrderDetailResponse update(UpdateOrderDetailRequest request);
    DeleteOrderDetailResponse delete(int id);
    List<ListOrderDetailResponse> getAll();
    GetOrderDetailResponse getById(int id);
}
