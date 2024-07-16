import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Es responsable de realizar las consultas a una API para obtener las tasas de cambio entre diferentes monedas.
public class RateFetcher {

    private static final String API_KEY = "a6c14f545b99dda2e33f330f";  // Reemplaza con tu clave de API real
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public String buscaConversion(String monedaBase, String monedaObjetivo, double cantidad) {
        try {
            // Construye la URL para la solicitud
            URI direccion = URI.create(API_URL + API_KEY + "/latest/" + monedaBase);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // Procesa la respuesta JSON
            var json = response.body();
            JsonElement jsonElement = JsonParser.parseString(json);
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            // Verifica que la respuesta contenga el resultado de la conversión
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            if (conversionRates.has(monedaObjetivo)) {
                double conversionRate = conversionRates.get(monedaObjetivo).getAsDouble();
                double convertedAmount = cantidad * conversionRate;
                return String.format("%.2f %s equivale a %.2f %s", cantidad, monedaBase, convertedAmount, monedaObjetivo);
            } else {
                throw new RuntimeException("Error: No se encontró la tasa de conversión para la moneda objetivo: " + monedaObjetivo);
            }

        } catch (NumberFormatException | IOException | InterruptedException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }
}
