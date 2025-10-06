package com.example.Tarea_Academicas_Estudiantes.service;

import com.example.Tarea_Academicas_Estudiantes.entitties.TareaAcademica;

import java.util.Date;
import java.util.List;

public interface TareaAcademicaService {
    TareaAcademica CrearTareaAcademica(String titulo, String descripcion, Date fecha, String estado);
    List<TareaAcademica> listarTodos();
    TareaAcademica ObtenerTareaAcademica(int id);




}
