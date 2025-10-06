package com.example.Tarea_Academicas_Estudiantes.entitties;

import java.util.Date;

public class TareaAcademica {
    private Long id;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private String estado;

    public TareaAcademica() {
    }

    public TareaAcademica(String estado, Date fecha, String descripcion, String titulo, Long id) {
        this.estado = estado;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}





