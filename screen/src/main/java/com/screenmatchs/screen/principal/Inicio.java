package com.screenmatchs.screen.principal;

import com.screenmatchs.screen.model.DatosSerie;
import com.screenmatchs.screen.model.DatosTemporadas;
import com.screenmatchs.screen.services.ConsumoApi;
import com.screenmatchs.screen.services.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio {
    private Scanner sc = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private final String URLBASE="https://www.omdbapi.com/?t=";
    private final String APIKEY="&apikey=d73ad810";
    public ConvierteDatos convierteDatos = new ConvierteDatos();




    public void mostrarMenu(){
        System.out.print("Por favor escribe el nombre: ");

        var nombreSerie = sc.nextLine();
        var json = consumoApi.obtenerDatos(URLBASE+nombreSerie.replace(" ","+")+APIKEY);
        var datos = convierteDatos.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);


        System.out.println("-------------------------");
        List<DatosTemporadas> temporadas  = new ArrayList<>();
        for (int i = 1; i <= datos.totalTemporadas(); i++) {
            json = consumoApi.obtenerDatos(URLBASE+nombreSerie.replace(" ","+")+"&Season="+i+APIKEY);
            var datosTemporada = convierteDatos.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporada);
        }
        temporadas.forEach(System.out::println);


    }
}
