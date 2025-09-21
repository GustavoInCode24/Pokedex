package br.edu.fatecpg.tp.pokedex.service;

public interface IConverterDados {
    <T> T obterDados(String json,Class<T> classe);
}
