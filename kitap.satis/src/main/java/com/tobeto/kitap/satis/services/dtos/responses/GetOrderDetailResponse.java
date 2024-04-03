package com.tobeto.kitap.satis.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderDetailResponse {
    private int id;

    private int orderId;

    private int bookId;

    private double unitPrice;

    private int quantity;
}
