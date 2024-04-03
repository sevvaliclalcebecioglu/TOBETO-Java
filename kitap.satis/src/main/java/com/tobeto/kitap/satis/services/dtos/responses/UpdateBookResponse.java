package com.tobeto.kitap.satis.services.dtos.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookResponse {
    private int id;

    private String publisherName;

    private String name;

    private int isbn;

    private int page;

    private double price;
}
