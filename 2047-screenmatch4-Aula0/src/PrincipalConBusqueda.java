import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        // creamos una instancia de HttpClient usando el metodo estatico ".newHttpClient()"
        //HttpClient pp = HttpClient.newHttpClient();
        // client
        System.out.print("Escribe un titulo: ");
        String nombre = scn.nextLine();
        HttpClient cliente = HttpClient.newHttpClient();

        // creamos una solicitud Http usando el patron de diseño builder
        // con "HttpRequest.newBuilder()" inicia la construccion de una solicitud
        // Reques
        String direccion = "https://www.omdbapi.com/?t="+nombre+"&apikey=85e486b9";
        HttpRequest reques = HttpRequest.newBuilder()
                // Define el URI al que se enviara la solicitud

                .uri(URI.create(direccion))
                .build();
                                        // usa el cliente creado para enviar la solicitud
        HttpResponse<String> response = cliente
                .send(reques, HttpResponse.BodyHandlers.ofString());

        // imprime el cuerpo de la respuesta HTTP en la consola
        //System.out.println(response.body());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        //Titulo miTitulo = gson.fromJson(json, Titulo.class);

        TituloOmdb miTitulo = gson.fromJson(json, TituloOmdb.class);
        System.out.println(miTitulo);
    }


}
