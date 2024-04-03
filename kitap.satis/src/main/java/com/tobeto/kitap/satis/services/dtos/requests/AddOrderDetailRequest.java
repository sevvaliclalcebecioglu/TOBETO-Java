package com.tobeto.kitap.satis.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderDetailRequest
{
    private int id;

    private int orderId;

    private int bookId;

    private double unitPrice;

    private int quantity;
}
