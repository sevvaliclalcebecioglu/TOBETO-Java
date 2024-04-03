package com.tobeto.kitap.satis.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePublisherRequest
{
    private int id;

    private String name;
}
