package com.pokelucas.pokelucas.service;

import com.pokelucas.pokelucas.model.BattleModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.util.Random;

@Service
public class BattleService {

    public ResponseEntity<String> battle() {

        //pokemon 1, 5

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://pokeapi.co/api/v2/pokemon";

        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("name");

        return response;
    }

    public String  pokemonRandom(Integer pokemon){
        Random gerador = new Random();
        pokemon = gerador.nextInt(1200);

        return "/" + pokemon.toString();
    }

}
