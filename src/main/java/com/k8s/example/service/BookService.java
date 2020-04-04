package com.k8s.example.service;

import com.k8s.example.data.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(String id);

    List<Book> getAllBooksByTitle(String title);

    List<Book> getAllBooksByGenre(String genre);
}
