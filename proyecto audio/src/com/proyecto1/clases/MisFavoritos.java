package com.proyecto1.clases;

public class MisFavoritos {
    public void adicione(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo()+ " es uno de los momentos fovoritos");
        }else {
            System.out.println(audio.getTitulo()+" tambien es uno de los momentos fovoritos");
        }
    }
}
