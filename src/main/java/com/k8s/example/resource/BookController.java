package com.k8s.example.resource;

import com.k8s.example.data.Book;
import com.k8s.example.service.BookService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") String id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/genre/{genre}")
    public List<Book> getAllBooksByGenre(@PathVariable("genre") String genre) {
        return bookService.getAllBooksByGenre(genre);
    }

    @GetMapping("/title/{title}")
    public List<Book> getAllBooksByTitle(@PathVariable("title") String title) {
        return bookService.getAllBooksByTitle(title);
    }
}
