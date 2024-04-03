package com.tobeto.kitap.satis.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookRequest {
    private int id;

    private int publisherId;

    @NotBlank
    private String name;

    private int isbn;

    private int page;

    private double price;
}
