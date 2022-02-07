package com.pokeApiChallenge.demo.models.entities;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ability implements Serializable {

    private static final long serialVersionUID = -8695122201111323312L;

    private String name;

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
