package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddBookRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface BookService {
    AddBookResponse add(AddBookRequest request);
    UpdateBookResponse update(UpdateBookRequest request);
    DeleteBookResponse delete(int id);
    List<ListBookResponse> getAll();
    GetBookResponse getById(int id);
}
