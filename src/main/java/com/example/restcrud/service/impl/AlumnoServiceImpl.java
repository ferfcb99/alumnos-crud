package com.example.restcrud.service.impl;

import com.example.restcrud.dto.AlumnoDto;
import com.example.restcrud.entity.Alumno;
import com.example.restcrud.mapper.AlumnoMapper;
import com.example.restcrud.repository.AlumnoRepository;
import com.example.restcrud.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public List<AlumnoDto> findAll() {
        return List.of();
    }

    @Override
    public AlumnoDto findById(Integer id) {
        return null;
    }

    @Override
    public AlumnoDto save(AlumnoDto alumnoDto) {
        Alumno alumno = AlumnoMapper.toEntity(alumnoDto);
        alumno = this.alumnoRepository.save(alumno);
        return AlumnoMapper.toDto(alumno);
    }

    @Override
    public AlumnoDto update(AlumnoDto alumnoDto) {
        return null;
    }

    @Override
    public AlumnoDto deleteById(Integer id) {
        return null;
    }


}
