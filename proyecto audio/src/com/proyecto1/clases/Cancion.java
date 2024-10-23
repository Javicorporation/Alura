package com.proyecto1.clases;

public class Cancion extends Audio{
    private String albun;
    private String genero;
    private String artista;

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int getClasificacion(){

        if (getNumeroDeReproduccion() >= 2000){
            return 9;
        }else {
            return 2;
        }
    }

}
