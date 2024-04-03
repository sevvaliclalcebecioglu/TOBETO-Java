package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.BookService;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController
{
    private BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public AddBookResponse add(@RequestBody @Valid AddBookRequest request){
        return bookService.add(request);
    }

    @PutMapping
    public UpdateBookResponse update(@RequestBody @Valid UpdateBookRequest request){
        return bookService.update(request);
    }

    @DeleteMapping
    public DeleteBookResponse delete(@RequestParam int id){
        return bookService.delete(id);
    }

    @GetMapping
    public List<ListBookResponse> getAll(){
        return bookService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetBookResponse getById(@PathVariable int id){
        return bookService.getById(id);
    }


}
