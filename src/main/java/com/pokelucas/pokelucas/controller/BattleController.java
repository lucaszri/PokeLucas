package com.pokelucas.pokelucas.controller;


import com.pokelucas.pokelucas.model.BattleModel;
import com.pokelucas.pokelucas.model.PokemonModel;
import com.pokelucas.pokelucas.service.BattleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BattleController {

    public final BattleService service;

    public BattleController(BattleService service) {
        this.service = service;
    }

    @GetMapping("/battle")
    public ResponseEntity<BattleModel> Battle(){

        PokemonModel poke1 = service.invokePokemon();
        PokemonModel poke2 = service.invokePokemon();

        BattleModel result = service.battleGenerate(poke1, poke2);

        return ResponseEntity.ok(result);
    }


}
