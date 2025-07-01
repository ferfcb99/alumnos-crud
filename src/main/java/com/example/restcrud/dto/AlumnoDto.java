package com.example.restcrud.dto;

import jakarta.validation.constraints.*;

public class AlumnoDto {

    @NotNull
    @Min(0)
    @Max(999999999)
    private Integer id;

    @NotNull
    @Size(min = 3, max = 50)
    @NotEmpty
    private String nombre;

    @NotNull
    @Size(min = 4, max = 50)
    @NotEmpty
    private String apellidoPaterno;

    @NotNull
    @Size(min = 4, max = 50)
    @NotEmpty
    private String apellidoMaterno;

    @NotNull
    @Min(0)
    @Max(120)
    private int edad;

    // al menos 5 caracteres y como maximo 30
    // no nulo
    private String carrera;

    public AlumnoDto(Integer id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.carrera = carrera;
    }

    public AlumnoDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
