package com.tobeto.kitap.satis.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAuthorRequest
{
    @NotBlank(message = "İsim alanı boş bırakılmaz.")
    private String name;

    @NotBlank(message = "Soyisim alanı boş bırakılmaz.")
    private String surname;

    private LocalDate birthdate;
}
