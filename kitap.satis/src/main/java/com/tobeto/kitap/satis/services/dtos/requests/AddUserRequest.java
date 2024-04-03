package com.tobeto.kitap.satis.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {
    private String name;

    private String surName;

    private String email;

    private String password;
}
