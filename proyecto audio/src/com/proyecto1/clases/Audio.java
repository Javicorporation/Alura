package com.proyecto1.clases;

public class Audio {
    private String titulo;
    private int numeroDeReproduccion;
    private int totalMeGustas;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeReproduccion() {
        return numeroDeReproduccion;
    }

    public void setNumeroDeReproduccion(int numeroDeReproduccion) {
        this.numeroDeReproduccion = numeroDeReproduccion;
    }

    public int getTotalMeGustas() {
        return totalMeGustas;
    }

    public void setTotalMeGustas(int totalMeGustas) {
        this.totalMeGustas = totalMeGustas;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta(){
        this.totalMeGustas++;
    }

    public void reproducir(){
        this.numeroDeReproduccion++;
    }
}
