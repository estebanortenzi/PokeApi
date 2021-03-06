package com.pokeApiChallenge.demo.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Move implements Serializable {

    private static final long serialVersionUID = -8695122882414040121L;

    private String name;

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
