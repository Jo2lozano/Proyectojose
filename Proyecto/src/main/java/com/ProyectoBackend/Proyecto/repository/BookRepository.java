package com.ProyectoBackend.Proyecto.repository;

import com.ProyectoBackend.Proyecto.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book,Long> {
    Book findByEdicion(String edition);
}
