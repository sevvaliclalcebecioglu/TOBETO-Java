package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddBookCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface BookCategoryService
{
    AddBookCategoryResponse add(AddBookCategoryRequest request);
    UpdateBookCategoryResponse update(UpdateBookCategoryRequest request);
    DeleteBookCategoryResponse delete(int id);
    List<ListBookCategoryResponse> getAll();
    GetBookCategoryResponse getById(int id);
}
