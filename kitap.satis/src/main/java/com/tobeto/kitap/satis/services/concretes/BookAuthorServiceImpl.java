package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.entities.Author;
import com.tobeto.kitap.satis.entities.Book;
import com.tobeto.kitap.satis.entities.BookAuthor;
import com.tobeto.kitap.satis.repositories.AuthorRepository;
import com.tobeto.kitap.satis.repositories.BookAuthorRepository;
import com.tobeto.kitap.satis.repositories.BookRepository;
import com.tobeto.kitap.satis.services.abstracts.BookAuthorService;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookAuthorRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class BookAuthorServiceImpl implements BookAuthorService {

    private BookAuthorRepository bookAuthorRepository;

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    @Override
    public AddBookAuthorResponse add(AddBookAuthorRequest request) {
        Author author = authorRepository.findById(request.getAuthorId()).orElseThrow();

        Book book = bookRepository.findById(request.getBookId()).orElseThrow();

        BookAuthor bookAuthor = new BookAuthor();
        bookAuthor.setAuthor(author);
        bookAuthor.setBook(book);

        BookAuthor addBookAuthor = bookAuthorRepository.save(bookAuthor);

        AddBookAuthorResponse response = new AddBookAuthorResponse(addBookAuthor.getId(),
                addBookAuthor.getAuthor().getId(),
                addBookAuthor.getBook().getId());

        return response;

    }

    @Override
    public UpdateBookAuthorResponse update(UpdateBookAuthorRequest request) {
        return null;
    }

    @Override
    public DeleteBookAuthorResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListBookAuthorResponse> getAll() {
        return null;
    }

    @Override
    public GetBookAuthorResponse getById(int id) {
        return null;
    }
}
