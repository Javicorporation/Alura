package com.screenmatchs.screen.principal;

import com.screenmatchs.screen.model.DatosEpisodio;
import com.screenmatchs.screen.model.DatosSerie;
import com.screenmatchs.screen.model.DatosTemporadas;
import com.screenmatchs.screen.services.ConsumoApi;
import com.screenmatchs.screen.services.ConvierteDatos;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

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


        System.out.println("-------------------------");

        // mostrar solo los titulos de las temporadas
//        for (int i = 0; i < datos.totalTemporadas(); i++) {
//            List<DatosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//
//        }

        // con el uso de
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<DatosEpisodio> listaDatosEpisodio = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        // top 5 episodios

        System.out.println("-------------------------");
        System.out.println(" los mejores 5 episodios");
        listaDatosEpisodio.stream()
                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
                .peek(e -> System.out.println("Primer Filtro: "+e))
                .sorted(Comparator.comparing(DatosEpisodio :: evaluacion).reversed())
                .peek(e -> System.out.println("segundo Filtro: "+e))
                .map(e -> e.titulo().toUpperCase())
                .peek(e -> System.out.println("tercer Filtro: "+e))
                .limit(5)
                .forEach(System.out::println);



        // convirtiendo los datos a lista de episodios

        System.out.println("-------------------------");
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                .map(d -> new Episodio(t.numero(), d)))
                        .collect(Collectors.toList());
                episodios.forEach(System.out::println);


//        // busqueda de serie por x fecha
//        System.out.println("-------------------------");
//        System.out.print("Indica  una fecha: ");
//        var fecha = sc.nextInt();
//
//        sc.nextLine();
//
//        LocalDate fechaBusqueda = LocalDate.of(fecha, 1, 1);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter( e -> e.getFecha() != null && e.getFecha().isAfter(fechaBusqueda))
//                .forEach(e -> System.out.println(
//                        "Temporada: "+e.getTemporada()+
//                                ", Episodio: "+e.getTitulo()+
//                                ", fecha: "+ e.getFecha().format(dtf)
//                ));

        // buscar episodios por medio de una parte del titulo
        System.out.println("-------------------------");
        System.out.print("Indica el fragmento de titulo: ");
        var pedazoTitulo = sc.nextLine();
        Optional<Episodio> episodioB = episodios.stream()
                .filter(e -> e.getTitulo().toUpperCase().contains(pedazoTitulo.toUpperCase()))
                .findFirst();

        if (episodioB.isPresent()){
            System.out.println("Episodio encontrado.");
            System.out.println("Los datos son: "+ episodioB.get());
        }else {
            System.out.println("Episodio no encontrado" );
        }
    }
}
