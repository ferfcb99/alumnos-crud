package com.example.restcrud.controller;

import com.example.restcrud.dto.AlumnoDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AlumnoController {

    ResponseEntity<List<AlumnoDto>> getAll();

    ResponseEntity<AlumnoDto> findById(Integer id);

    ResponseEntity<AlumnoDto> save(AlumnoDto alumnoDto);

    ResponseEntity<AlumnoDto> update(AlumnoDto alumnoDto);

    ResponseEntity<AlumnoDto> delete(Integer id);
}

