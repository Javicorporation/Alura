package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmach.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalViws;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie(Serie serie1) {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViws() {
        return totalViws;
    }

    public void setTotalViws(int totalViws) {
        this.totalViws = totalViws;
    }

    @Override
    public int getClasificacion() {
        if (totalViws > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
