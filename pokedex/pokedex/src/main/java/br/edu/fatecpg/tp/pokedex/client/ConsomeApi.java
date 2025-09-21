package br.edu.fatecpg.tp.pokedex.client;
import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsomeApi {

    public String obterDados(String endereco){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return response.body();
        }catch (Exception e){
            throw new RuntimeException("Erro ao consumir a API: " + e.getMessage());
        }
    }
}
