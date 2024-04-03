package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.BookAuthorService;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookAuthors")
public class BookAuthorsController
{
    private BookAuthorService bookAuthorService;

    public BookAuthorsController(BookAuthorService bookAuthorService) {
        this.bookAuthorService = bookAuthorService;
    }

    @PostMapping
    public AddBookAuthorResponse add(@RequestBody AddBookAuthorRequest request){
        return bookAuthorService.add(request);
    }

    @PutMapping
    public UpdateBookAuthorResponse update(@RequestBody UpdateBookAuthorRequest request){
        return bookAuthorService.update(request);
    }

    @DeleteMapping
    public DeleteBookAuthorResponse delete(@RequestParam int id){
        return bookAuthorService.delete(id);
    }

    @GetMapping
    public List<ListBookAuthorResponse> getAll(){
        return bookAuthorService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetBookAuthorResponse getById(@PathVariable int id){
        return bookAuthorService.getById(id);
    }

}
