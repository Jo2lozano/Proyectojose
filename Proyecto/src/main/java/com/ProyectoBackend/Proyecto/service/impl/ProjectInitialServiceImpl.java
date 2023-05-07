package com.ProyectoBackend.Proyecto.service.impl;

import com.ProyectoBackend.Proyecto.dto.AuthorDto;
import com.ProyectoBackend.Proyecto.entity.Author;
import com.ProyectoBackend.Proyecto.entity.Book;
import com.ProyectoBackend.Proyecto.repository.AuthorRepository;
import com.ProyectoBackend.Proyecto.repository.BookRepository;
import com.ProyectoBackend.Proyecto.service.ProjectInitialService;
import com.ProyectoBackend.Proyecto.service.converter.AuthorConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProjectInitialServiceImpl implements ProjectInitialService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    @Override
    public List<AuthorDto> getAuthor() {
           for(Author author : authorRepository.findAll()){
               if(author.getNombre().contains("A"))
                   authorRepository.delete(author);
           }
            return authorRepository.findAll()
                   .stream()
                   .map(this::mapAuthorDto)
                   .collect(Collectors.toList());
    }

    @Override
    public Boolean updateBook(AuthorDto author) {
        Author authorData = authorRepository.findByNombre(author.getNameAuthor());
        if(authorData != null) {
            authorData.setNombre(author.getNameAuthor());
            authorData.setContactos(author.getContactAuthor());
            authorRepository.save(authorData);
            return true;
        }
       return false;
    }

    @Override
    public String getEdition(String edition) {
        return bookRepository.findByEdicion(edition).getNombre();
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll().stream()
                .filter(result->result.getNombre().contains("A"))
                .collect(Collectors.toList());
    }

    private AuthorDto mapAuthorDto(Author author){
        return AuthorConverter.AuthorToDTO(author);
    }
}
