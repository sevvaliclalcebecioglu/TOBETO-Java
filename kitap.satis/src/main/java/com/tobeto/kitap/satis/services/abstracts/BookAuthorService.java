package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddBookAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface BookAuthorService {
    AddBookAuthorResponse add(AddBookAuthorRequest request);
    UpdateBookAuthorResponse update(UpdateBookAuthorRequest request);
    DeleteBookAuthorResponse delete(int id);
    List<ListBookAuthorResponse> getAll();
    GetBookAuthorResponse getById(int id);
}
