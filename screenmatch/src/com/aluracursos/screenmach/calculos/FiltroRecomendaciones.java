package com.aluracursos.screenmach.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado");
        }else if(clasificacion.getClasificacion() == 2){
            System.out.println("popular en el momento");
        }else {
            System.out.println("miralo despues");
        }
    }
}
