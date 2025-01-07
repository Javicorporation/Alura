import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Principal {
    public static void main(String[] args) {

        String urlName = "https://v6.exchangerate-api.com/v6/e294440fc7e5bd4c948ec300/latest/USD";

        try {
            // Crear la URL
            URL url = new URL(urlName);

            // Establecer la conexión
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Parsear la respuesta con Gson
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader(request.getInputStream()));
            JsonObject jsonobject = root.getAsJsonObject();

            // Imprimir el JSON completo
            System.out.println(jsonobject.toString());

            // Verificar y extraer el campo 'result'
            JsonElement resultElement = jsonobject.get("result");
            if (resultElement != null) {
                String result = resultElement.getAsString();
                System.out.println("Resultado: " + result);
            } else {
                System.out.println("La clave 'result' no existe en el JSON devuelto.");
            }

            // Acceder a las tasas de conversión
            JsonObject conversionRates = jsonobject.getAsJsonObject("conversion_rates");
            if (conversionRates != null) {
                double eurRate = conversionRates.get("EUR").getAsDouble();
                System.out.println("Tasa de conversión USD a EUR: " + eurRate);
            } else {
                System.out.println("La clave 'conversion_rates' no existe en el JSON devuelto.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
