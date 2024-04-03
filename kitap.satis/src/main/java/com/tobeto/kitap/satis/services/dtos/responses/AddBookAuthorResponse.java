package com.tobeto.kitap.satis.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBookAuthorResponse
{
    private int id;

    private int authorId;

    private int bookId;
}
