package com.pokelucas.pokelucas.service;

import com.pokelucas.pokelucas.model.BattleModel;
import com.pokelucas.pokelucas.model.PokemonModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.util.Random;


@Service
public class BattleService {

    private static final Random GERADOR = new Random();
    private static final int MAX_POKEMON_ID = 1350;

    public PokemonModel invokePokemon() {

        String pokemonUrl = String.valueOf(GERADOR.nextInt(MAX_POKEMON_ID));

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://pokeapi.co/api/v2/pokemon/";

        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl + pokemonUrl, String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("name");
        int power = GERADOR.nextInt(100);

        return new PokemonModel(name.toString(), power);
    }

    public BattleModel battleGenerate(PokemonModel pokemon1, PokemonModel pokemon2) {
        String vencedor = pokemon1.getPower() > pokemon2.getPower() ? pokemon1.getName() :
                pokemon2.getPower() > pokemon1.getPower() ? pokemon2.getName() :
                        "Empate";

        String result = "A batalha foi vencida por: " + vencedor;

        return new BattleModel(pokemon1, pokemon2, result);
    }

}
