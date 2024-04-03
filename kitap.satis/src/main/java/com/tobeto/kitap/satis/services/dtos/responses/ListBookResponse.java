package com.tobeto.kitap.satis.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListBookResponse {
    private int id;

    private String name;

    private int isbn;

    private int page;

    private double price;
}
