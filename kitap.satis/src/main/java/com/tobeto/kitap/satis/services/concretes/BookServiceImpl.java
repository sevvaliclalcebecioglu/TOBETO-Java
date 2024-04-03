package com.tobeto.kitap.satis.services.concretes;

import com.tobeto.kitap.satis.core.utils.exceptions.types.BusinessException;
import com.tobeto.kitap.satis.entities.Book;
import com.tobeto.kitap.satis.entities.Publisher;
import com.tobeto.kitap.satis.repositories.BookRepository;
import com.tobeto.kitap.satis.repositories.PublisherRepository;
import com.tobeto.kitap.satis.services.abstracts.BookService;
import com.tobeto.kitap.satis.services.dtos.requests.AddBookRequest;
import com.tobeto.kitap.satis.services.dtos.requests.UpdateBookRequest;
import com.tobeto.kitap.satis.services.dtos.responses.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {


    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;


    @Override
    public AddBookResponse add(AddBookRequest request) {
        bookWithSameIsbnShouldNotExists(request.getIsbn());
        Publisher publisher = publisherRepository.findById(request.getPublisherId()).orElseThrow();

        Book book = new Book();
        book.setName(request.getName());
        book.setPublisher(publisher);
        book.setPrice(request.getPrice());
        book.setIsbn(request.getIsbn());
        book.setPage(request.getPage());

        Book addBook = bookRepository.save(book);

        AddBookResponse response = new AddBookResponse(addBook.getId(), addBook.getName(), addBook.getIsbn(), addBook.getPage(), addBook.getPrice());

        return response;

    }

    @Override
    public UpdateBookResponse update(UpdateBookRequest request) {
        bookWithSameIsbnShouldNotExists(request.getIsbn());
        Publisher publisher = publisherRepository.findById(request.getPublisherId()).orElseThrow();

        Book book = bookRepository.findById(request.getId()).orElseThrow();
        book.setName(request.getName());
        book.setPublisher(publisher);
        book.setIsbn(request.getIsbn());
        book.setPage(request.getPage());
        book.setPrice(request.getPrice());

        bookRepository.save(book);

        UpdateBookResponse response = new UpdateBookResponse();
        response.setId(request.getId());
        response.setPublisherName(publisher.getName());
        response.setName(request.getName());
        response.setIsbn(request.getIsbn());
        response.setPage(request.getPage());
        response.setPrice(request.getPrice());

        return response;

    }

    @Override
    public DeleteBookResponse delete(int id) {
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);

        DeleteBookResponse response = new DeleteBookResponse(book.getId(), book.getName(), book.getIsbn());

        return response;
    }

    @Override
    public List<ListBookResponse> getAll() {
        List<Book> books = bookRepository.findAll();
        List<ListBookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {
            ListBookResponse response = new ListBookResponse(book.getId(), book.getName(), book.getIsbn(), book.getPage(), book.getPrice());
            bookResponses.add(response);
        }

        return bookResponses;
    }

    @Override
    public GetBookResponse getById(int id) {
        Book book = bookRepository.findById(id).orElseThrow();

        GetBookResponse response = new GetBookResponse(book.getId(), book.getName(), book.getIsbn(), book.getPage(), book.getPrice());

        return response;
    }

    private void bookWithSameIsbnShouldNotExists(int isbn){
        Optional<Book> bookWithSameIsbn = bookRepository.findByIsbn(isbn);

        if (bookWithSameIsbn.isPresent()){
            throw new BusinessException("Aynı isbnde iki kitap bulunamaz!");
        }
    }

}
