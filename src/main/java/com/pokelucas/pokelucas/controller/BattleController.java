package com.pokelucas.pokelucas.controller;


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

    @GetMapping("/pokemon")
    public ResponseEntity<String> FirstEndpoint(){
        return service.battle();
    }


}
