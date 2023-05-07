package com.ProyectoBackend.Proyecto.dto;


import com.ProyectoBackend.Proyecto.entity.Book;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDto {
    private Long identityAuthor;
    private String nameAuthor;
    private String contactAuthor;
    private List<Book> libroDtoList;
}