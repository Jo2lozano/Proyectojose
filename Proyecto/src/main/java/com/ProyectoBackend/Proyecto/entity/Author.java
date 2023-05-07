package com.ProyectoBackend.Proyecto.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "Autor")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Contactos")
    private String contactos;

    @OneToMany(fetch= FetchType.LAZY,mappedBy ="autor",cascade = CascadeType.ALL)
    private List<Book> libros;
}
