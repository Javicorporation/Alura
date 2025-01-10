package com.screenmatchs.screen.principal;

import com.screenmatchs.screen.model.DatosEpisodio;

import java.time.LocalDate;

public class Episodio {

    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double evaluacion;
    private LocalDate fecha;

    public Episodio(Integer numero, DatosEpisodio datosEpisodio) {
        this.temporada = numero;
        this.titulo = datosEpisodio.titulo();;
        this.numeroEpisodio = datosEpisodio.numeroEpisodio();
        try {
            this.evaluacion = Double.valueOf(datosEpisodio.evaluacion());
        }catch (NumberFormatException e){
            this.evaluacion = 0.0;
        }

        this.fecha = LocalDate.parse(datosEpisodio.fechaDeLanzamiento()) ;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return  "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", evaluacion=" + evaluacion +
                ", fecha=" + fecha ;
    }
}
