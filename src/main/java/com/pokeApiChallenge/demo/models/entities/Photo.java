package com.pokeApiChallenge.demo.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Photo implements Serializable {

    private static final long serialVersionUID = -8695332882423541121L;

    private String front_default;

    @Override
    public String toString() {
        return front_default;
    }
}
