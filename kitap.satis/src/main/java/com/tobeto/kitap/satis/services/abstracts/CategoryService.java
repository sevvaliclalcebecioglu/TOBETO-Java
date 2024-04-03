package com.tobeto.kitap.satis.services.abstracts;

import com.tobeto.kitap.satis.services.dtos.requests.AddCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;

import java.util.List;

public interface CategoryService
{
    AddCategoryResponse add(AddCategoryRequest request);

    UpdateCategoryResponse update(UpdateCategoryRequest request);

    DeleteCategoryResponse delete(int id);
    List<ListCategoryResponse> getAll();
    GetCategoryResponse getById(int id);
}
