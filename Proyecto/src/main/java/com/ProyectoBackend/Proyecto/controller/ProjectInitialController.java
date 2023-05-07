package com.ProyectoBackend.Proyecto.controller;

import com.ProyectoBackend.Proyecto.dto.AuthorDto;
import com.ProyectoBackend.Proyecto.entity.Book;
import com.ProyectoBackend.Proyecto.service.ProjectInitialService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/v1")
@Slf4j
@RequiredArgsConstructor
public class ProjectInitialController {

    private final ProjectInitialService service;

    @GetMapping("/Author")
    public ResponseEntity<List<AuthorDto>> author(){
        log.info("here out");
        return ResponseEntity.ok(service.getAuthor());
    }
    @PutMapping("/Books-Other")
    public ResponseEntity<Boolean> updateBook(@RequestBody AuthorDto author) {
        log.info("updateBook controller");
        return ResponseEntity.ok(service.updateBook(author));
    }

    @GetMapping("/Books-Edition/{edition}")
    public ResponseEntity<String> findEdition(@PathVariable String edition) {
        log.info("findEdition controller");
        return ResponseEntity.ok(service.getEdition(edition));
    }

    @GetMapping("/Books/{id}")
    public ResponseEntity<Optional<Book>> findBook(@PathVariable Long id) {
        log.info("findBook controller");
        return ResponseEntity.ok(service.getBook(id));
    }

}
