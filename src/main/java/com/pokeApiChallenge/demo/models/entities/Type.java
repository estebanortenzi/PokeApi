package com.pokeApiChallenge.demo.models.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Type {

    private String name;

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
