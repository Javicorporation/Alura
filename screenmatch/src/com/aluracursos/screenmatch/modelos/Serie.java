package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorCapitulo;


    @Override
    public int  getDuracionEnMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorCapitulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorCapitulo() {
        return minutosPorCapitulo;
    }

    public void setMinutosPorCapitulo(int minutosPorCapitulo) {
        this.minutosPorCapitulo = minutosPorCapitulo;
    }
}
