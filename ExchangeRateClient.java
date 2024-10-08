import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ExchangeRateClient { //el nombre de la clase es el mismo que el nombre de la API

    private String key;


    public ExchangeRateClient() {
        this.key = System.getenv("KEY");

    }

    /**
     * Este método calcula la conversión de una cantidad monetaria (`monto`) basada en una lista de valores de conversión.
     *
     * @param monto La cantidad monetaria a convertir.
     * @param valor Una lista de valores que se usarán para realizar la conversión.
     * @return Un valor de tipo double que representa el resultado de la conversión.
     */
    public double getPairConversionRequest(Double monto, List valor) {
        //el nombre del metodo es el mismo que el nombre del endpoint

        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Crear una solicitud GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + this.key + "/pair/" + valor.get(0) + "/" + valor.get(1) + "/" + monto)) // Cambia la URL al web service que quieras llamar
                .GET() // Especificar que es una petición GET
                .build();

        // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Imprimir el código de estado y el cuerpo de la respuesta
            //System.out.println("Código de estado: " + response.statusCode());
            //System.out.println("Cuerpo de la respuesta: " + response.body());

            Gson gson = new Gson();
            GetPairConversionResponse getPairConversionResponse = gson.fromJson(response.body(), GetPairConversionResponse.class);

            //System.out.println("Conversion Result = " + GetPairConversionResponse.getConversion_result());

            return getPairConversionResponse.getConversionResult();

            //    DESEREALIZAR response.body()   = SACAR Y RETORNAR conversion_result DEL BODY

        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage());
        }

        return 0;
    }


}
