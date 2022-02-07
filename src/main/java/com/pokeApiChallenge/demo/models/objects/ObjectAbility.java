package com.pokeApiChallenge.demo.models.objects;

import com.pokeApiChallenge.demo.models.entities.Ability;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObjectAbility implements Serializable{

    private Ability ability;

    @Override
    public String toString() {
        return ability.toString();
    }
}
