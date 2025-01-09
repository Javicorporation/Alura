package com.screenmatchs.screen;

import com.screenmatchs.screen.model.DatosEpisodio;
import com.screenmatchs.screen.model.DatosSerie;
import com.screenmatchs.screen.model.DatosTemporadas;
import com.screenmatchs.screen.principal.EjemploStreams;
import com.screenmatchs.screen.principal.Inicio;
import com.screenmatchs.screen.services.ConsumoApi;
import com.screenmatchs.screen.services.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;

@SpringBootApplication
public class ScreenApplication  implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(ScreenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        EjemploStreams ejemploStreams = new EjemploStreams();
        ejemploStreams.muestraEjemplo();
//        Inicio inicio = new Inicio();
//        inicio.mostrarMenu();
//        var consumoApi = new ConsumoApi();
//        var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=d73ad810");
//
//        //var json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
//        System.out.println(json);
//
//        ConvierteDatos conversor = new ConvierteDatos();
//        var datos = conversor.obtenerDatos(json, DatosSerie.class);
//        System.out.println(datos);
//
//        System.out.println("-------------------------");
//        json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=d73ad810");
//        DatosEpisodio datosEpisodio = conversor.obtenerDatos(json, DatosEpisodio.class);
//        System.out.println(datosEpisodio);
//
//        System.out.println("-------------------------");
//        List<DatosTemporadas> temporadas  = new ArrayList<>();
//        for (int i = 1; i <= datos.totalTemporadas(); i++) {
//            json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season="+i+"&apikey=d73ad810");
//            var datosTemporada = conversor.obtenerDatos(json, DatosTemporadas.class);
//            temporadas.add(datosTemporada);
//        }
//
//        temporadas.forEach(System.out::println);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Holi");
//        int min = 1; // Límite inferior
//        int max = 31; // Límite superior
//
//        Random random = new Random();
//        int numeroAleatorio = random.nextInt((max - min) + 1) + min;
//
//        System.out.println("Número aleatorio: " + numeroAleatorio);
//    }
}
