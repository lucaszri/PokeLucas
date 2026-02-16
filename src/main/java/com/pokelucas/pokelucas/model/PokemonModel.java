package com.pokelucas.pokelucas.model;

public class PokemonModel {

    String name;
    int power;

    public PokemonModel(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
