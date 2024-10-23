package com.proyecto1.test;

import com.proyecto1.clases.Cancion;
import com.proyecto1.clases.MisFavoritos;
import com.proyecto1.clases.Podcast;

public class Main {
    public static void main(String[] args) {
        Cancion c = new Cancion();
        c.setTitulo("Forever");
        c.setArtista("Kiss");

        Podcast p = new Podcast();
        p.setTitulo("Que Fue");
        p.setPresentador("Juanin");

        for (int i = 0; i < 100; i++) {
            c.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            c.reproducir();
        }

        for (int i = 0; i < 100; i++) {
            p.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            p.reproducir();
        }
        System.out.println("Total de me gusta "+c.getTotalMeGustas());
        System.out.println("Total de reproducciones "+c.getNumeroDeReproduccion());
        System.out.println();
        System.out.println("Total de me gusta "+p.getTotalMeGustas());
        System.out.println("Total de reproducciones "+p.getNumeroDeReproduccion());


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(p);
        favoritos.adicione(c);
    }
}
