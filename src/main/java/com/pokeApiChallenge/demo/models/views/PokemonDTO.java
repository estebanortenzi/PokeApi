package com.pokeApiChallenge.demo.models.views;

import com.pokeApiChallenge.demo.models.entities.Photo;
import com.pokeApiChallenge.demo.models.objects.ObjectAbility;
import com.pokeApiChallenge.demo.models.objects.ObjectMove;
import com.pokeApiChallenge.demo.models.objects.ObjectType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PokemonDTO implements Serializable {

    private static final long serialVersionUID = -8594122012414640121L;

    private String name;
    private Photo sprites;
    private List<ObjectType> types;
    private Float weight;
    private List<ObjectAbility> abilities;
    private String description;
    private List<ObjectMove> moves;

}
