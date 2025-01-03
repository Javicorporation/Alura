import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        // creamos una instancia de HttpClient usando el metodo estatico ".newHttpClient()"
        //HttpClient pp = HttpClient.newHttpClient();
        // client
        HttpClient cliente = HttpClient.newHttpClient();

        // creamos una solicitud Http usando el patron de diseño builder
        // con "HttpRequest.newBuilder()" inicia la construccion de una solicitud
        // Reques
        HttpRequest reques = HttpRequest.newBuilder()
                // Define el URI al que se enviara la solicitud
                .uri(URI.create("https://www.omdbapi.com/?t=matrix&apikey=85e486b9"))
                .build();
                                        // usa el cliente creado para enviar la solicitud
        HttpResponse<String> response = cliente
                .send(reques, HttpResponse.BodyHandlers.ofString());

        // imprime el cuerpo de la respuesta HTTP en la consola
        System.out.println(response.body());
    }


}
