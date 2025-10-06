package com.example.Tarea_Academicas_Estudiantes.repositories;

import com.example.Tarea_Academicas_Estudiantes.entitties.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepository {
    private final List<Estudiante> lista = new ArrayList<>();
    private long nextId = 1;

    public Estudiante save(Estudiante estudiante) {
        if (estudiante.getId() == null) {
            estudiante.setId(nextId++);
            lista.add(estudiante);

        }
        return estudiante;
    }

    public List<Estudiante> findAll() {
        return lista;
    }

    public Optional<Estudiante> findById(long id) {
        return lista.stream().filter(x -> x.getId() == id).findFirst();

    }
}



