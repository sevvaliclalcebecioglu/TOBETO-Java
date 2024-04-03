package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.OrderDetailService;
import com.tobeto.kitap.satis.services.dtos.requests.AddOrderDetailRequest;
import com.tobeto.kitap.satis.services.dtos.requests.AddOrderRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderDetailRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderDetails")
public class OrderDetailsController
{
    private OrderDetailService orderDetailService;

    public OrderDetailsController(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    @PostMapping
    public AddOrderDetailResponse add(@RequestBody AddOrderDetailRequest request){
        return orderDetailService.add(request);
    }

    @PutMapping
    public UpdateOrderDetailResponse update(@RequestBody UpdateOrderDetailRequest request){
        return orderDetailService.update(request);
    }

    @DeleteMapping
    public DeleteOrderDetailResponse delete(@RequestParam int id){
        return orderDetailService.delete(id);
    }

    @GetMapping
    public List<ListOrderDetailResponse> getAll(){
        return orderDetailService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetOrderDetailResponse getById(@PathVariable int id){
        return orderDetailService.getById(id);
    }

}
