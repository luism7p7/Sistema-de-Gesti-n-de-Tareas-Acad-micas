package com.example.Tarea_Academicas_Estudiantes.repositories;

import com.example.Tarea_Academicas_Estudiantes.entitties.TareaAcademica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;

public class TareaAcademicaRepository {
    private final List<TareaAcademica> listaTarea = new ArrayList();
    private long nextId1 = 1;

    public TareaAcademica save (TareaAcademica tareaAcademica) {
        if(tareaAcademica.getId() == null){
            tareaAcademica.setId(nextId1++);
            listaTarea.add(tareaAcademica);
        }
        return tareaAcademica;

    }
    public List<TareaAcademica> findAll(){
        return listaTarea;
    }

    public Optional<TareaAcademica> findById(long id){
        return listaTarea.stream().filter(x -> x.getId() == id).findFirst();
    }








}
