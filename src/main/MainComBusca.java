package main;

import javax.sound.midi.SysexMessage;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class MainComBusca {
    static void main(String[] args) throws IOException, InterruptedException {


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um filme para busca: ");
        var busca = sc.nextLine();
        var endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=def1090f";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());



        // Inicio de integração de APIs

    }
}
