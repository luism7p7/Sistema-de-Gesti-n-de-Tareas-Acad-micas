package com.example.Tarea_Academicas_Estudiantes.service.Impl;

import com.example.Tarea_Academicas_Estudiantes.entitties.TareaAcademica;
import com.example.Tarea_Academicas_Estudiantes.repositories.TareaAcademicaRepository;
import com.example.Tarea_Academicas_Estudiantes.service.TareaAcademicaService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TareaAcademicaImpl implements TareaAcademicaService {

    private final TareaAcademicaRepository tareaAcademicaRepository;

    public TareaAcademicaImpl(TareaAcademicaRepository tareaAcademicaRepository) {
        this.tareaAcademicaRepository = tareaAcademicaRepository;
    }

    @Override
    public TareaAcademica CrearTareaAcademica(String titulo, String descripcion, Date fecha, String estado) {
        TareaAcademica nuevaTarea = new TareaAcademica();
        nuevaTarea.setTitulo(titulo);
        nuevaTarea.setDescripcion(descripcion);
        nuevaTarea.setFecha(fecha);
        nuevaTarea.setEstado(estado);
        return tareaAcademicaRepository.save(nuevaTarea);
    }

    @Override
    public List<TareaAcademica> listarTodos() {
        return tareaAcademicaRepository.findAll();
    }

    @Override
    public TareaAcademica ObtenerTareaAcademica(int id) {
        return tareaAcademicaRepository.findById(id).orElse(null);
    }


}