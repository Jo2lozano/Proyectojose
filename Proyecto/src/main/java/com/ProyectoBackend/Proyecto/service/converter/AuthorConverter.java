package com.ProyectoBackend.Proyecto.service.converter;

import com.ProyectoBackend.Proyecto.dto.AuthorDto;
import com.ProyectoBackend.Proyecto.entity.Author;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthorConverter {

    private AuthorConverter(){}

    public static AuthorDto AuthorToDTO(Author autor) {
        try {
            return AuthorDto.builder()
                    .identityAuthor(autor.getId())
                    .nameAuthor(autor.getNombre())
                    .contactAuthor(autor.getContactos())
                    .libroDtoList(autor.getLibros())
                    .build();
        } catch (Exception ex) {
            log.error("Error Mapping from Author{}", autor);
            throw new RuntimeException("Error Mapping from Entity To entityReal");
        }
    }
}
