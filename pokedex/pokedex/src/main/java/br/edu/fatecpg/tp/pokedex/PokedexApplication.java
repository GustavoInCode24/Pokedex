package br.edu.fatecpg.tp.pokedex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.edu.fatecpg.tp.pokedex.client.ConsomeApi;
import br.edu.fatecpg.tp.pokedex.service.ConverterDados;
import br.edu.fatecpg.tp.pokedex.service.IConverterDados;
import br.edu.fatecpg.tp.pokedex.model.DadosPokemon;
import java.util.Scanner;
@SpringBootApplication
public class PokedexApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do pokemon ");
        String pokemon = sc.nextLine();

        String url =  "https://pokeapi.co/api/v2/pokemon/" + pokemon;

        ConsomeApi consomeApi = new ConsomeApi();
        String json = consomeApi.obterDados(url);

        ConverterDados converterDados = new ConverterDados();
        DadosPokemon dadosPokemon = converterDados.obterDados(json,DadosPokemon.class);

        System.out.println("Nome: " + dadosPokemon.nomePokemon());
        System.out.println("Altura: " + dadosPokemon.altura());
        System.out.println("Peso: " + dadosPokemon.peso());

        sc.close();
    }
}
