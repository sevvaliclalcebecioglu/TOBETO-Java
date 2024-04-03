package com.tobeto.kitap.satis.services.dtos.responses;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListAuthorResponse {
    private int id;

    private String name;

    private String surname;

    private LocalDate birthdate;
}
