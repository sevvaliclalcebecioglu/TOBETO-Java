package com.tobeto.kitap.satis.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBookRequest {

    @NotBlank
    private String name;

    private int publisherId;

    private int isbn;

    private int page;

    private double price;

}
