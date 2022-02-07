package com.pokeApiChallenge.demo.models.objects;

import com.pokeApiChallenge.demo.models.entities.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObjectType implements Serializable {

    private static final long serialVersionUID = -8594122018914668335L;

    private Integer slot;
    private Type type;

    @Override
    public String toString() {
        return type.toString();
    }
}
