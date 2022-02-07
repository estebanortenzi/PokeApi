package com.pokeApiChallenge.demo.models.objects;

import com.pokeApiChallenge.demo.models.entities.Move;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ObjectMove implements Serializable {

    private static final long serialVersionUID = -889515204831485872L;

    private Move move;

    @Override
    public String toString() {return move.toString();}
}
