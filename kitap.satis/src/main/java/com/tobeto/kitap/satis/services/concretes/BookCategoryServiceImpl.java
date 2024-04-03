package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.services.abstracts.BookCategoryService;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookCategoryServiceImpl implements BookCategoryService {
    @Override
    public AddBookCategoryResponse add(AddBookCategoryRequest request) {
        return null;
    }

    @Override
    public UpdateBookCategoryResponse update(UpdateBookCategoryRequest request) {
        return null;
    }

    @Override
    public DeleteBookCategoryResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListBookCategoryResponse> getAll() {
        return null;
    }

    @Override
    public GetBookCategoryResponse getById(int id) {
        return null;
    }
}
