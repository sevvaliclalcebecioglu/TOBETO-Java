package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.BookCategoryService;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookCategoryRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookCategories")
public class BookCategoriesController
{
    private BookCategoryService bookCategoryService;

    public BookCategoriesController(BookCategoryService bookCategoryService) {
        this.bookCategoryService = bookCategoryService;
    }

    @PostMapping
    public AddBookCategoryResponse add(@RequestBody AddBookCategoryRequest request){
        return bookCategoryService.add(request);
    }

    @PutMapping
    public UpdateBookCategoryResponse update(@RequestBody UpdateBookCategoryRequest request){
        return bookCategoryService.update(request);
    }

    @DeleteMapping
    public DeleteBookCategoryResponse delete(@RequestParam int id){
        return bookCategoryService.delete(id);
    }

    @GetMapping
    public List<ListBookCategoryResponse> getAll(){
        return bookCategoryService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetBookCategoryResponse getById(@PathVariable int id){
        return bookCategoryService.getById(id);
    }

}
