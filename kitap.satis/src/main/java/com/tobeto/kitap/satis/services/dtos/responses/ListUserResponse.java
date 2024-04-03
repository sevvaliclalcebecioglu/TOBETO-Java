package com.tobeto.kitap.satis.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListUserResponse {
    private int id;

    private String name;

    private String surName;

    private String email;

    private String password;
}
