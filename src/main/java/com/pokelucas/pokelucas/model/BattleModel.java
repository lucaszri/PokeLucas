package com.pokelucas.pokelucas.model;

public class BattleModel {

    PokemonModel pokemon1;
    PokemonModel pokemon2;
    String result;

    public BattleModel(PokemonModel pokemon1, PokemonModel pokemon2, String result) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.result = result;
    }

    public PokemonModel getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(PokemonModel pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public PokemonModel getPokemon2() {
        return pokemon2;
    }

    public void setPokemon2(PokemonModel pokemon2) {
        this.pokemon2 = pokemon2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



}
