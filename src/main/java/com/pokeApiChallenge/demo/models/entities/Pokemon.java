package com.pokeApiChallenge.demo.models.entities;

import com.pokeApiChallenge.demo.models.Enums.Type;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Pokemon {

    //Informacion basica
    private String name;
    private String foto;
    private List<Type> types;
    private Float weight;

    private String description;
    private List<Move> moves;


}

