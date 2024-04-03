package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.CategoryService;
import com.tobeto.kitap.satis.services.dtos.requests.AddCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController
{
    private CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public AddCategoryResponse add(@RequestBody AddCategoryRequest request){
        return categoryService.add(request);
    }

    @PutMapping
    public UpdateCategoryResponse update(@RequestBody UpdateCategoryRequest request){
        return categoryService.update(request);
    }

    @DeleteMapping
    public DeleteCategoryResponse delete(@RequestParam int id){
        return categoryService.delete(id);
    }

    @GetMapping
    public List<ListCategoryResponse> getAll(){
        return categoryService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetCategoryResponse getById(@PathVariable int id){
        return categoryService.getById(id);
    }

}
