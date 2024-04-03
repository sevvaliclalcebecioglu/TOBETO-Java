package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface AuthorService {
    AddAuthorResponse add(AddAuthorRequest request);
    UpdateAuthorResponse update(UpdateAuthorRequest request);
    DeleteAuthorResponse delete(int id);
    List<ListAuthorResponse> getAll();
    GetAuthorResponse getById(int id);
}
