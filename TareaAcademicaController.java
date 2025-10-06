package com.example.Tarea_Academicas_Estudiantes.controllers;

import com.example.Tarea_Academicas_Estudiantes.entitties.TareaAcademica;
import com.example.Tarea_Academicas_Estudiantes.service.TareaAcademicaService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaAcademicaController {

    private final TareaAcademicaService tareaAcademicaService;

    public TareaAcademicaController(TareaAcademicaService tareaAcademicaService) {
        this.tareaAcademicaService = tareaAcademicaService;
    }

    @PostMapping
    public TareaAcademica crearTareaAcademica(@RequestBody TareaAcademica tareaAcademica) {
        return tareaAcademicaService.CrearTareaAcademica(
                tareaAcademica.getTitulo(),
                tareaAcademica.getDescripcion(),
                tareaAcademica.getFecha(),
                tareaAcademica.getEstado()
        );
    }

    @GetMapping
    public List<TareaAcademica> listarTodas() {
        return tareaAcademicaService.listarTodos();
    }

    @GetMapping("/{id}")
    public TareaAcademica obtenerTareaAcademica(@PathVariable int id) {
        return tareaAcademicaService.ObtenerTareaAcademica(id);
    }
}
