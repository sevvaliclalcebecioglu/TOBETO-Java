package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.entities.Author;
import com.tobeto.kitap.satis.repositories.AuthorRepository;
import com.tobeto.kitap.satis.services.abstracts.AuthorService;
import com.tobeto.kitap.satis.services.dtos.requests.AddAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Override
    public AddAuthorResponse add(AddAuthorRequest request) {
        Author author = new Author();
        author.setName(request.getName());
        author.setSurname(request.getSurname());
        author.setBirthdate(request.getBirthdate());

        Author saveAuthor = authorRepository.save(author);

        AddAuthorResponse response = new AddAuthorResponse(saveAuthor.getId(), saveAuthor.getName(), saveAuthor.getSurname(),saveAuthor.getBirthdate());

        return response;
    }

    @Override
    public UpdateAuthorResponse update(UpdateAuthorRequest request) {
        Author author = authorRepository.findById(request.getId()).orElseThrow();
        author.setName(request.getName());
        author.setSurname(request.getSurname());
        author.setBirthdate(request.getBirthdate());

        authorRepository.save(author);

        UpdateAuthorResponse response = new UpdateAuthorResponse();
        response.setId(request.getId());
        response.setName(request.getName());
        response.setSurname(request.getSurname());
        response.setBirthdate(request.getBirthdate());

        return response;
    }

    @Override
    public DeleteAuthorResponse delete(int id) {
        Author author = authorRepository.findById(id).orElseThrow();
        authorRepository.deleteById(id);
        DeleteAuthorResponse response = new DeleteAuthorResponse(author.getId(),author.getName() , author.getSurname());

        return response;
    }

    @Override
    public List<ListAuthorResponse> getAll() {
        List<Author> authors = authorRepository.findAll();
        List<ListAuthorResponse> result = new ArrayList<>();

        for (Author author : authors){
            ListAuthorResponse response = new ListAuthorResponse(author.getId(), author.getName(), author.getSurname(), author.getBirthdate());
                    result.add(response);
        }
        return result;
    }

    @Override
    public GetAuthorResponse getById(int id) {
        Author author = authorRepository.findById(id).orElseThrow();
        GetAuthorResponse response  = new GetAuthorResponse(author.getId(), author.getName(), author.getSurname(), author.getBirthdate());

        return response;
    }
}
