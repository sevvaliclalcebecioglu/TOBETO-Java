package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.OrderService;
import com.tobeto.kitap.satis.services.dtos.requests.AddOrderRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateOrderRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdersController
{
    private OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public AddOrderResponse add(@RequestBody AddOrderRequest request){
        return orderService.add(request);
    }

    @PutMapping
    public UpdateOrderResponse update(@RequestBody UpdateOrderRequest request){
        return orderService.update(request);
    }

    @DeleteMapping
    public DeleteOrderResponse delete(@RequestParam int id){
        return orderService.delete(id);
    }

    @GetMapping
    public List<ListOrderResponse> getAll(){
        return orderService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetOrderResponse getById(@PathVariable int id){
        return orderService.getById(id);
    }

}
