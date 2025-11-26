# 📦 Pokedex — Primeiros Passos com Spring Boot

Este projeto é uma **introdução prática ao Spring Boot**, com o tema da **Pokédex** para tornar o aprendizado mais divertido! 🎮  
Aqui, você irá explorar conceitos básicos como chamadas HTTP, organização em pacotes e boas práticas com Java e Spring Boot.

---

## 🚀 Sobre o Projeto

Este projeto consome dados de uma API pública de Pokémon e os transforma em objetos Java usando conceitos fundamentais do Spring Boot.  
É perfeito para quem está iniciando com:

- Estrutura de aplicações Spring
- Organização de pacotes
- Consumo de APIs REST
- Conversão de dados JSON
- Separação de responsabilidades (Service, Model, etc.)

---

## 🗂️ Estrutura do Projeto

```
Pokedex/
└── src/
└── main/
└── java/
└── br/
└── edu/
└── fatecpg/
└── tp/
└── pokedex/
├── client/
│ └── ConsomeApi.java
│
├── model/
│ └── DadosPokemon.java
│
├── service/
│ ├── ConverterDados.java
│ └── IConverterDados.java
│
└── PokedexApplication.java

```

---

## 📁 Descrição das Pastas

| Pasta        | Conteúdo                                                 |
|--------------|----------------------------------------------------------|
| `client/`    | Responsável por consumir a API externa de Pokémon        |
| `model/`     | Representa os dados do Pokémon como objetos Java         |
| `service/`   | Contém a lógica para conversão e manipulação dos dados   |
| `PokedexApplication.java` | Classe principal que executa a aplicação     |

---

## 🛠️ Tecnologias Usadas

- Java 17 (ou 11+)
- Spring Boot
- Maven
- API pública PokéAPI (https://pokeapi.co/)
- IDE de sua preferência (IntelliJ, Eclipse, VS Code...)

---

## ▶️ Como Executar

1. Clone o projeto:

```bash
git clone https://github.com/GustavoInCode24/Pokedex.git
```
2. Navegue até o diretório do projeto:
```bash
cd Pokedex/pokedex
```
3. Rode a aplicação:
```bash
./mvnw spring-boot:run
```
4. Verifique o resultado no console. A aplicação irá consumir dados da API e exibir informações de Pokémon.

---

## 🎓 Objetivo Educacional

Este projeto foi criado como parte de uma introdução prática ao **Spring Boot**, com o objetivo de aprender e aplicar conceitos essenciais do framework em um cenário divertido.  
Foca em:

- Organização de pacotes e camadas (client, model, service)
- Consumo de APIs REST
- Manipulação de dados JSON
- Uso do Spring Boot de forma simples e eficiente

Ideal para quem está começando no ecossistema Spring e quer entender como estruturar projetos reais.

---

## 👤 Autor

**Gustavo Lemos**  
GitHub: [@GustavoInCode24](https://github.com/GustavoInCode24)

   
