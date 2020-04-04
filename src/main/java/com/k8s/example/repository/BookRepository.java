package com.k8s.example.repository;

import com.k8s.example.data.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, String> {

    List<Book> findAllByTitleContains(String title);

    @Query("SELECT b FROM Book b, Genre g WHERE g.name = :genreName")
    List<Book> findAllByGenreName(String genreName);

}
