package br.edu.fatecpg.tp.pokedex.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPokemon(
        @JsonAlias("name") String nomePokemon,
        @JsonAlias("height") String altura,
        @JsonAlias("weight") String peso
) {
}


