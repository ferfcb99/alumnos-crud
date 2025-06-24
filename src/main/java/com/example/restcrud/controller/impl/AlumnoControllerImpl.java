package com.example.restcrud.controller.impl;

import com.example.restcrud.controller.AlumnoController;
import com.example.restcrud.dto.AlumnoDto;
import com.example.restcrud.service.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/crud/alumno")
public class AlumnoControllerImpl implements AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoControllerImpl(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @Override
    public ResponseEntity<List<AlumnoDto>> getAll() {
        return null;
    }

    @Override
    @GetMapping(value = "/get-by-id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AlumnoDto> findById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(alumnoService.findById(id));
    }

    @Override
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AlumnoDto> save(@RequestBody AlumnoDto alumnoDto) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(alumnoService.save(alumnoDto));
    }

    @Override
    public ResponseEntity<AlumnoDto> update(AlumnoDto alumnoDto) {
        return null;
    }

    @Override
    public ResponseEntity<AlumnoDto> delete(Integer id) {
        return null;
    }
}
