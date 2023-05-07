package com.ProyectoBackend.Proyecto.repository;

import com.ProyectoBackend.Proyecto.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
    Author findByNombre(String name);

}
