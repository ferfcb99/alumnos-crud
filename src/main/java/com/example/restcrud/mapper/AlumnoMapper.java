package com.example.restcrud.mapper;

import com.example.restcrud.dto.AlumnoDto;
import com.example.restcrud.entity.Alumno;

import java.time.LocalDateTime;


public final class AlumnoMapper {

    public static AlumnoDto toDto(Alumno alumno) {
        AlumnoDto alumnoDto = new AlumnoDto();
        alumnoDto.setId(alumno.getId());
        alumnoDto.setNombre(alumno.getNombre());
        alumnoDto.setApellidoPaterno(alumno.getApellidoPaterno());
        alumnoDto.setApellidoMaterno(alumno.getApellidoMaterno());
        alumnoDto.setEdad(alumno.getEdad());
        alumnoDto.setCarrera(alumno.getCarrera());
        return alumnoDto;
    }

    public static Alumno toEntity(AlumnoDto alumnoDto) {
        Alumno alumno = new Alumno();
        alumno.setId(alumnoDto.getId());
        alumno.setNombre(alumnoDto.getNombre());
        alumno.setApellidoPaterno(alumnoDto.getApellidoPaterno());
        alumno.setApellidoMaterno(alumnoDto.getApellidoMaterno());
        alumno.setEdad(alumnoDto.getEdad());
        alumno.setCarrera(alumnoDto.getCarrera());
        alumno.setFechaCreacion(LocalDateTime.now());
        return alumno;
    }

}
