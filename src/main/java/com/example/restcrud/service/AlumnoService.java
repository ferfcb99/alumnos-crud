package com.example.restcrud.service;

import com.example.restcrud.dto.AlumnoDto;

import java.util.List;

public interface AlumnoService {

    public List<AlumnoDto> findAll();

    public AlumnoDto findById(Integer id);

    public AlumnoDto save(AlumnoDto alumnoDto);

    public AlumnoDto update(AlumnoDto alumnoDto);

    public AlumnoDto deleteById(Integer id);

}
