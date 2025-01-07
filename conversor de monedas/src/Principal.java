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

        //URL url = null;
        try {
            URL url = new URL(urlName);

            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobject = root.getAsJsonObject();
            String requestresult = jsonobject.get("resultado").getAsString();
            System.out.println(jsonobject.toString());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
