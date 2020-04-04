package com.k8s.example.service.impl;

import com.k8s.example.data.Book;
import com.k8s.example.repository.BookRepository;
import com.k8s.example.service.BookService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String id) {
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> getAllBooksByTitle(String title) {
        return bookRepository.findAllByTitleContains(title);
    }

    @Override
    public List<Book> getAllBooksByGenre(String genreName) {
        return bookRepository.findAllByGenreName(genreName);
    }
}
