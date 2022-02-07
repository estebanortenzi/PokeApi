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

    private static final long serialVersionUID = -817366105774662121L;

    private Ability ability;

    @Override
    public String toString() {
        return ability.toString();
    }
}
