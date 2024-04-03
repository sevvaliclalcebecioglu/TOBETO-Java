package com.tobeto.kitap.satis.services.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBookAuthorRequest
{
    private int id;

    private int authorId;

    private int bookId;
}
