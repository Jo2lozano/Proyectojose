package com.ProyectoBackend.Proyecto.service;

import com.ProyectoBackend.Proyecto.dto.AuthorDto;
import com.ProyectoBackend.Proyecto.entity.Author;
import com.ProyectoBackend.Proyecto.entity.Book;
import java.util.List;
import java.util.Optional;

public interface ProjectInitialService {
    List<AuthorDto> getAuthor();
    Optional<Book> getBook(Long id);
    String  getEdition(String edition);
    Boolean updateBook(AuthorDto author);

    List<Book> getBooks();
}
