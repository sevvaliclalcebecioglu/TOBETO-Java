package com.tobeto.kitap.satis.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBookCategoryResponse
{
    private int id;

    private int categoryId;

    private int bookId;
}
