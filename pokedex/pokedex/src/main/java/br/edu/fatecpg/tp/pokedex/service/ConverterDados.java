package br.edu.fatecpg.tp.pokedex.service;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ConverterDados implements IConverterDados {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try{
            return mapper.readValue(json,classe);
        }catch (Exception e) {
            throw new RuntimeException("Erro ao converter Json: " + e.getMessage());
        }
    }
}
