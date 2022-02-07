package com.pokeApiChallenge.demo.models.entities;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon implements Serializable {

    private static final long serialVersionUID = -8695122002415640021L;

    //Informacion basica
    private String name;
    private Photo sprites;
    private List<ObjectType> types;
    private Float weight;
    private List<ObjectAbility> abilities;

    private String description = " Es un pokemon muy fuerte y raro";
    private List<ObjectMove> moves;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name.toUpperCase() + '\'' +
                ", photo='" + sprites.getFront_default() + '\'' +
                ", types=" + types +
                ", weight=" + weight +
                ", abilities=" + abilities +
                ", description='" + description + '\'' +
                ", moves=" + moves +
                '}';
    }
}

