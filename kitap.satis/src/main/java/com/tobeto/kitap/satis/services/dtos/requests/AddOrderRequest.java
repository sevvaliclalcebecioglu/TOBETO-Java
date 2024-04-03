package com.tobeto.kitap.satis.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderRequest
{
    private int id;

    private int bookId;

    private int userId;

    private LocalDate orderDate;
}
