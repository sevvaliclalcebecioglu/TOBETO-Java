package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.entities.Category;
import com.tobeto.kitap.satis.repositories.CategoryRepository;
import com.tobeto.kitap.satis.services.abstracts.CategoryService;
import com.tobeto.kitap.satis.services.dtos.requests.AddCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public AddCategoryResponse add(AddCategoryRequest request) {
        Category category = new Category();

        category.setName(request.getName());

        Category addCategory = categoryRepository.save(category);

        AddCategoryResponse response = new AddCategoryResponse(addCategory.getId(), addCategory.getName());

        return response;
    }

    @Override
    public UpdateCategoryResponse update(UpdateCategoryRequest request) {
        Category category = categoryRepository.findById(request.getId()).orElseThrow();
        category.setName(request.getName());

        categoryRepository.save(category);

        UpdateCategoryResponse response = new UpdateCategoryResponse(request.getId(), request.getName());

        return response;
    }

    @Override
    public DeleteCategoryResponse delete(int id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        categoryRepository.delete(category);

        DeleteCategoryResponse response = new DeleteCategoryResponse(category.getId(), category.getName());

        return response;
    }

    @Override
    public List<ListCategoryResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();
        List<ListCategoryResponse> categoryResponses = new ArrayList<>();

        for (Category category : categories) {
            ListCategoryResponse response = new ListCategoryResponse(category.getId(), category.getName());
            categoryResponses.add(response);
        }

        return categoryResponses;

    }

    @Override
    public GetCategoryResponse getById(int id) {
        Category category = categoryRepository.findById(id).orElseThrow();

        GetCategoryResponse response = new GetCategoryResponse(category.getId(),category.getName());

        return response;
    }
}
