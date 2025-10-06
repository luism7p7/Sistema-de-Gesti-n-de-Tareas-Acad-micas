package com.example.Tarea_Academicas_Estudiantes.service.Impl;

import com.example.Tarea_Academicas_Estudiantes.entitties.Estudiante;
import com.example.Tarea_Academicas_Estudiantes.repositories.EstudianteRepository;
import com.example.Tarea_Academicas_Estudiantes.service.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public Estudiante createEstudiante(String nombre) {
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNombre(nombre);
        return estudianteRepository.save(nuevoEstudiante);
    }

    @Override
    public List<Estudiante> listarTodos() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante obtenerEstudiante(int id) {
        return estudianteRepository.findById(id).orElse(null);
    }
}