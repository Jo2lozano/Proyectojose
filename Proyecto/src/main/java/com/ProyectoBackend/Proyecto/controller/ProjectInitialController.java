package com.ProyectoBackend.Proyecto.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1")
@Slf4j
public class ProjectInitialController {
    

    @GetMapping("/Person")
    public ResponseEntity<String>testInitial (){
        log.info("here out");
        return ResponseEntity.ok("succesful");
    }

}
