package com.ProyectoBackend.Proyecto.entity;
import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "persona")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Nombre")
    private String nombre;

}
