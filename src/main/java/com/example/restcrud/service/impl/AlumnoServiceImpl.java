package com.example.restcrud.service.impl;

import com.example.restcrud.dto.AlumnoDto;
import com.example.restcrud.entity.Alumno;
import com.example.restcrud.exception.PersonalizedException;
import com.example.restcrud.mapper.AlumnoMapper;
import com.example.restcrud.repository.AlumnoRepository;
import com.example.restcrud.service.AlumnoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public List<AlumnoDto> findAll() {
        List<Alumno> alumnos = this.alumnoRepository.findAll();
        AlumnoDto aDto;
        List<AlumnoDto> alumnosDto = new ArrayList<>();

        for (Alumno a : alumnos){
            aDto = AlumnoMapper.toDto(a);
            alumnosDto.add(aDto);
        }

        return alumnosDto;
    }

    @Override
    public AlumnoDto findById(Integer id) {
        AlumnoDto alumnoDto = new AlumnoDto();
        Optional<Alumno> alumnoOptional = this.alumnoRepository.findById(id);

        if(alumnoOptional.isEmpty()){
            return null; // null
        }

        Alumno alumno = alumnoOptional.get();
        return AlumnoMapper.toDto(alumno); // null
    }

    @Override
    public AlumnoDto save(AlumnoDto alumnoDto) {
        Optional<Alumno> alumno = this.alumnoRepository.findById(alumnoDto.getId());
        if(alumno.isPresent()){
            throw new PersonalizedException("Error", "400", "Alumno ya registrado");
        }
        return null;
    }

    @Override
    public AlumnoDto update(AlumnoDto alumnoDto) {
        return null;
    }

    @Override
    public AlumnoDto deleteById(Integer id) {
        AlumnoDto alumnoDto = findById(id);
        this.alumnoRepository.deleteById(id);
        return alumnoDto;
    }
}
