package com.example.Tarea_Academicas_Estudiantes.service;

import com.example.Tarea_Academicas_Estudiantes.entitties.Estudiante;

import java.util.List;

public interface EstudianteService {
    Estudiante createEstudiante(String nombre);
    List<Estudiante> listarTodos();
    Estudiante obtenerEstudiante(int id);

}
