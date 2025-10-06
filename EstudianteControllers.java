package com.example.Tarea_Academicas_Estudiantes.controllers;

import com.example.Tarea_Academicas_Estudiantes.entitties.Estudiante;
import com.example.Tarea_Academicas_Estudiantes.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllers {

    private final EstudianteService estudianteService;

    public EstudianteControllers(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    public Estudiante createEstudiante(@RequestBody String nombre) {
        return estudianteService.createEstudiante(nombre);
    }

    @GetMapping
    public List<Estudiante> listarTodos() {
        return estudianteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Estudiante obtenerEstudiante(@PathVariable int id) {
        return estudianteService.obtenerEstudiante(id);
    }
}