package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.services.abstracts.AuthorService;
import com.tobeto.kitap.satis.services.dtos.requests.AddAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorsController
{
    private AuthorService authorService;

    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public AddAuthorResponse add(@RequestBody @Valid  AddAuthorRequest request){
        return authorService.add(request);
    }

    @PutMapping
    public UpdateAuthorResponse update(@RequestBody @Valid UpdateAuthorRequest request){
        return authorService.update(request);
    }

    @DeleteMapping
    public DeleteAuthorResponse delete(@RequestParam int id){
       return  authorService.delete(id);
    }

    @GetMapping
    public List<ListAuthorResponse> getAll(){
        return authorService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GetAuthorResponse getById(@PathVariable int id){
        return authorService.getById(id);
    }
}
